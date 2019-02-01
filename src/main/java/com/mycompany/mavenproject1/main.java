/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Cenario1.*;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author IFPB
 */
public class main {
    
    public static void main(String[] args) {
                
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyAppPU");
        EntityManager em = emf.createEntityManager();

        Funcionario joao = new Funcionario("Joao", new RG("111"), new CPF("111"), 0);
        Projeto projetoA = new Projeto("projeto desc.", "Area A", new Date(), new Date());
        Alocacao alocacao = new Alocacao(
                joao, projetoA, new Date(), 40
        );
        
        
        em.getTransaction().begin();
        em.persist(joao);
        em.persist(projetoA);
        em.persist(alocacao);
        em.getTransaction().commit();
        
    }
    
}
