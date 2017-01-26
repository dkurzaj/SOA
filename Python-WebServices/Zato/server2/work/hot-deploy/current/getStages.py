# -*- coding: utf-8 -*-

import sys, os, re, json
sys.path.append("/opt/zato/2.0.7/zato-server/src")
from pprint import pprint
from zato.server.service import Service
from lxml.etree import Element, fromstring, QName, SubElement, tostring

class GetAllStages(Service):
    def handle(self):

        # Fetch connection to Web Services
        ir_availableofferids = self.outgoing.plain_http.get('http-REST-service_getAvailableOffersIDs')
        gc_availableofferids = self.outgoing.plain_http.get('http-SOAP-service_getAvailableOffersIDs')
        ir_getoffer = self.outgoing.plain_http.get('http-REST-service_getOffer')
        gc_getoffer = self.outgoing.plain_http.get('http-SOAP-service_getOffer')

        available_offerids_svcs = [ir_availableofferids, gc_availableofferids]
        get_offer_svcs = [ir_getoffer, gc_getoffer]

        self.response.payload = {}
        list_offers = []

        #Traitement du service SOAP
        response = gc_availableofferids.conn.get(self.cid, {})
        print(response.text)
        #Il faudrait utiliser XPath pour que ce soit propre mais j'ai la flemme
        all_gc_ids = [int(s) for s in re.findall(">([0-9]+)<", response.text)]
        for gc_id in all_gc_ids:
            response = gc_getoffer.conn.get(self.cid, {'id': gc_id})
            list_offers.append({
                "id": int(re.findall("<tns:id>(.*)</tns:id>", response.text)[0]),
                "stage_date": re.findall("<tns:stage_date>(.*)</tns:stage_date>", response.text)[0],
                "description": re.findall("<tns:description>(.*)</tns:description>", response.text)[0],
                "duree": int(re.findall("<tns:duree>(.*)</tns:duree>", response.text)[0]),
                "lieu": re.findall("<tns:lieu>(.*)</tns:lieu>", response.text)[0],
                "titre": re.findall("<tns:titre>(.*)</tns:titre>", response.text)[0],
                "entreprise": int(re.findall("<tns:entreprise>(.*)</tns:entreprise>", response.text)[0])
                })

        #Traitement du service REST
        response = ir_availableofferids.conn.get(self.cid, {})
        all_ir_ids = json.loads(response.text)
        for ir_id in all_ir_ids:
            response = ir_getoffer.conn.get(self.cid, {"id": ir_id})
            list_offers.append(json.loads(response.text)[0])

        self.response.payload = {"AllAvailableOffers": list_offers}
        return 