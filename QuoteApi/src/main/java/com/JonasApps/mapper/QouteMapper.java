/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JonasApps.mapper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import com.JonasApps.Entity.Qoute;

/**
 *
 * @author Jonas
 */
public class QouteMapper {
    
    private EntityManagerFactory emf;

    public QouteMapper(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
    
    public Qoute getQouteById(int id){
        EntityManager em = emf.createEntityManager();
        
        Qoute q;
        
        try{
            em.getTransaction().begin();
            
            q = em.find(Qoute.class, (Integer)id);
            em.getTransaction().commit();
      
              return  q;
        }finally{
            em.close();
        }
        
      
    
    
}
    
}
