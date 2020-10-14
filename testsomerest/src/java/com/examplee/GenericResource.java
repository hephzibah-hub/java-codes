
package com.examplee;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;


@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

   
    public GenericResource() {
    }

 
@GET
@Produces("text/plain")
public String postHandler(String content ) {
    return "Hello friend";
}
    






}
   
    
