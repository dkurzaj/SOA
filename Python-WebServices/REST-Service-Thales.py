from Stages import offres_stage_thales
"""Voir http://spyne.io/ pour exemples"""

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
            yield offres_stage_thales[id]
        except:
            pass

    @rpc(_returns=Iterable(Integer))
    def getAvailableOffersIDs(ctx):
        for i in range(len(offres_stage_thales)):
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
