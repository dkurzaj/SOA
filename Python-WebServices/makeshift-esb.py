"""Voir http://spyne.io/ pour exemples"""
"""WSDL disponible sur : http://127.0.0.1:8000/?wsdl"""
# -*- coding: utf-8 -*-

import json
from collections import OrderedDict

def get_offres_stage_from_json():
    with open('offers/ir-offers.json') as f:    
        offres_stage = json.loads(f.read(), object_pairs_hook=OrderedDict)['listOfAvailableOffers']
    return offres_stage

offres_stage = get_offres_stage_from_json()

import logging
logging.basicConfig(level=logging.DEBUG)
from spyne import Application, rpc, ServiceBase, \
    Integer, Unicode
from spyne import Iterable
from spyne.protocol.http import HttpRpc
from spyne.protocol.json import JsonDocument
from spyne.server.wsgi import WsgiApplication

class HelloWorldService(ServiceBase):
    @rpc(Integer, _returns=str)
    def getOffer(ctx, id):
        try:
            offres_stage = get_offres_stage_from_json()
            for offre in offres_stage:
                if offre['id'] == id:
                    yield offre
        except:
            pass
            

    @rpc(_returns=Iterable(Integer))
    def getAvailableOffersIDs(ctx):
        for i in range(len(offres_stage)):
            yield i

application = Application([HelloWorldService],
    tns='spyne.examples.hello',
    in_protocol=HttpRpc(validator='soft'),
    out_protocol=JsonDocument()
)
if __name__ == '__main__':
    # You can use any Wsgi server. Here, we chose
    # Python's built-in wsgi server but you're not
    # supposed to use it in production.
    from wsgiref.simple_server import make_server
    wsgi_app = WsgiApplication(application)
    server = make_server('0.0.0.0', 8001, wsgi_app)
    server.serve_forever()
