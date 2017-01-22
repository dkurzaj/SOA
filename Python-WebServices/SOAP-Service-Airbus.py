from Stages import offres_stage_airbus
"""Voir http://spyne.io/ pour exemples"""

import logging
logging.basicConfig(level=logging.DEBUG)
from spyne import Application, rpc, ServiceBase, \
    Integer, Unicode
from spyne import Iterable
from spyne.protocol.http import HttpRpc
from spyne.protocol.soap import Soap11
from spyne.server.wsgi import WsgiApplication

class HelloWorldService(ServiceBase):
    @rpc(Integer, _out_variable_names=["id", "stage_date", "description", "duree", "lieu", "titre", "entreprise"], _returns=[int, str, str, int, str, str, int])
    def getOffer(ctx, id):
        try:
            for k, v in offres_stage_airbus[id].items():
                yield v
        except:
            pass

    @rpc(_returns=Iterable(Integer))
    def getAvailableOffersIDs(ctx):
        for i in range(len(offres_stage_airbus)):
            yield i


application = Application([HelloWorldService],
    tns='spyne.examples.hello',
    in_protocol=HttpRpc(validator='soft'),
    out_protocol=Soap11()
)
if __name__ == '__main__':
    # You can use any Wsgi server. Here, we chose
    # Python's built-in wsgi server but you're not
    # supposed to use it in production.
    from wsgiref.simple_server import make_server
    wsgi_app = WsgiApplication(application)
    server = make_server('0.0.0.0', 8000, wsgi_app)
    server.serve_forever()
