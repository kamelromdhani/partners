class UrlMappings {

	static mappings = {
        "/api/$controller/$action?/$id?(.$format)?"{
            //action = [GET: "show", PUT: "update", POST: "save", DELETE: "delete"]
            constraints {
                // apply constraints here
            }
        }
        "/api/partner"(resources: 'partner')
        //"/"(view:"/index")
        //"500"(view:'/error')
	}
}
