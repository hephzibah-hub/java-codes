/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.service;

import com.examples.MicroMarket;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Richeal Ayettey
 */
@javax.ejb.Stateless
@javax.ws.rs.Path("com.examples.micromarket")
public class MicroMarketFacadeREST extends AbstractFacade<MicroMarket> {

    @PersistenceContext(unitName = "CustomerDBPU")
    private EntityManager em;

    public MicroMarketFacadeREST() {
        super(MicroMarket.class);
    }

    @javax.ws.rs.POST
    @Override
    @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public void create(MicroMarket entity) {
        super.create(entity);
    }

    @javax.ws.rs.PUT
    @javax.ws.rs.Path("{id}")
    @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public void edit(@javax.ws.rs.PathParam("id") String id, MicroMarket entity) {
        super.edit(entity);
    }

    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("{id}")
    public void remove(@javax.ws.rs.PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @javax.ws.rs.GET
    @javax.ws.rs.Path("{id}")
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public MicroMarket find(@javax.ws.rs.PathParam("id") String id) {
        return super.find(id);
    }

    @javax.ws.rs.GET
    @Override
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public List<MicroMarket> findAll() {
        return super.findAll();
    }

    @javax.ws.rs.GET
    @javax.ws.rs.Path("{from}/{to}")
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public List<MicroMarket> findRange(@javax.ws.rs.PathParam("from") Integer from, @javax.ws.rs.PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @javax.ws.rs.GET
    @javax.ws.rs.Path("count")
    @javax.ws.rs.Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
