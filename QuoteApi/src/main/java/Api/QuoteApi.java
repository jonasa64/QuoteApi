/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Api;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import com.JonasApps.mapper.QouteMapper;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.PathParam;
import Json.JSonConverter;

/**
 * REST Web Service
 *
 * @author Jonas
 */
@Path("Api")
public class QuoteApi {

    EntityManagerFactory emf;
    QouteMapper qm;
    JSonConverter jc;
    
   
    
    
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of QuoteApi
     */
    public QuoteApi() {
         this.emf = Persistence.createEntityManagerFactory("com.mycompany_QuoteApi_war_1.0-SNAPSHOTPU");
         this.qm = new QouteMapper(emf);
         
    }

    /**
     * Retrieves representation of an instance of Api.QuoteApi
     * @return an instance of java.lang.String
     */
    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(String content,@PathParam("id") int id) {
        //TODO return proper representation object
      com.JonasApps.Entity.Qoute q = qm.getQouteById(id);
      
      return jc.getJSONFromPerson(q);
    }

    /**
     * PUT method for updating or creating an instance of QuoteApi
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
