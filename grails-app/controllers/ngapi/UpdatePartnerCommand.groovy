package ngapi

import grails.validation.Validateable

@Validateable
class UpdatePartnerCommand {
    PartnerService partnerService

    String id
    String name
    String reference
    Locale locale
    String expirationTime

    def execute(){
        def partner= Partner.get(id)
        partner.companyName= name
        partner.ref= reference
        partner.locale= locale
        partner.expires= expirationTime
        partnerService.save(partner)
    }

}
