import grails.converters.JSON
import ngapi.Partner

class BootStrap {

    def init = { servletContext ->
        JSON.registerObjectMarshaller(Partner){
            def returnMap = [:]
            returnMap['id']= it.id
            returnMap['name']=it.companyName
            returnMap['reference']= it.ref
            returnMap['locale']=it.locale
            returnMap['expirationTime']= it.expires
            return returnMap
        }
    }
    def destroy = {
    }
}
