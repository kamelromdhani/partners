package ngapi
@grails.validation.Validateable
class CreatePartnerCommand {

    PartnerService partnerService

    String name
    String reference
    Locale locale
    String expirationTime

    def execute(){

        Partner partner = new Partner(companyName: name, ref: reference, locale: locale, expires: expirationTime)
        partner.id = UUID.randomUUID().toString()
        partnerService.save(partner)
    }

}
