package ngapi

import grails.transaction.Transactional

@Transactional
class PartnerService {

    def save(Partner partner){
         partner.save() // la dernier ligne est consideré comme return
    }

    def list(){
        Partner.getAll()
    }

    def get(String id){
        Partner.get(id)
    }

    def update(Partner partner){

    }

    def delete(String id){
        Partner partner = Partner.findById(id)
        partner.delete()
    }
}
