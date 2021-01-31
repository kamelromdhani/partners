package ngapi

import groovy.transform.ToString

@ToString
class Partner implements Serializable{
    String id
    String companyName
    String ref
    Locale locale
    String expires

    static constraints = {

    }

    static mapping = {
        id generator: "uuid", length: 32
    }


}
