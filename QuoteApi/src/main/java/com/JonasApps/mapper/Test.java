/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JonasApps.mapper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.JonasApps.Entity.Qoute;
/**
 *
 * @author Jonas
 */
public class Test {
    public static void main(String[] args) {
            EntityManagerFactory emf =Persistence.createEntityManagerFactory("com.mycompany_QuoteApi_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
      
    }
}
