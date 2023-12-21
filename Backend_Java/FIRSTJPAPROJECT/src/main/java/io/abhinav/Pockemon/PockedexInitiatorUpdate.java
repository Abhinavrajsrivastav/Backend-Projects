package io.abhinav.Pockemon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PockedexInitiatorUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Abhinav");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        Pockemon p = entityManager.find(Pockemon.class,"Pikachu");
        if(p!=null) {
        	p.setPower(100000);
        	
        	entityTransaction.begin();
        	entityManager.persist(p);
        	entityTransaction.commit();
        }
        else {
        	System.out.println("Entry doesn't exist");
        }
        
	}

}
