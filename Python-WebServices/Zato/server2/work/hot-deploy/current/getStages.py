# Zato
from zato.server.service import Service

class GetAllStages(Service):
    def handle(self):

        # Fetch connection to CRM
        ir_availableofferids = self.outgoing.plain_http.get('http-REST-service_getAvailableOffersIDs')
        gc_availableofferids = self.outgoing.plain_http.get('http-SOAP-service_getAvailableOffersIDs')
        ir_getoffer = self.outgoing.plain_http.get('http-REST-service_getOffer')
        gc_getoffer = self.outgoing.plain_http.get('http-SOAP-service_getOffer')

        available_offerids_svcs = [ir_availableofferids, gc_availableofferids]
        get_offer_svcs = [ir_getoffer, gc_getoffer]

        all_available_offerids = []
        for available_offerids_svc in available_offerids_svcs:
            response = available_offerids_svc.send()
            all_available_offerids.append(response.data)

        self.logger.info('All available_offerids: {}'.format(all_available_offerids))

        all_offers = []
        for get_offer_svc, available_offerids in zip(get_offer_svcs, all_available_offerids):
            offers = []
            for available_offerid in available_offerids:
                offer = get_offer_svc.send(available_offerid)
                offers.append(offer.data)
            all_offers.append(offers)

        self.logger.info('All offers: {}'.format(all_offers))

        response = {}
        response['first_name'] = cust['firstName']
        response['last_name'] = cust['lastName']
        response['last_payment_date'] = last_payment['DATE']
        response['last_payment_amount'] = last_payment['AMOUNT']

        self.logger.info('Response: {}'.format(response))

        # And return response to the caller
        self.response.payload = response
