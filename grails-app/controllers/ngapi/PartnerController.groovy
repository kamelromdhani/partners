package ngapi

import grails.converters.JSON
import grails.rest.RestfulController

class PartnerController extends RestfulController{

    PartnerService partnerService
    static responseFormats = ['json']

    def save(CreatePartnerCommand partner){
       response.status=201
        respond(partner.execute())

    }

    def index(){
        respond(partnerService.list())
    }

    def show(String id){
        println id
        respond(partnerService.get(id))
    }

    def update(UpdatePartnerCommand partner){
        println "called update"
    response.status=204
        respond(partner.execute())
    }
    def delete(String id){
        partnerService.delete(id)
        respond([status: 200])
    }

}
