/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usgservice;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType; 

/**
 *
 * @author Richeal Ayettey
 */
@Path ("Testt")
public class Testtservice {
    @GET
    @Path("Hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String icreatedanAPI(){
        return "hello i created an API";
    }

}
