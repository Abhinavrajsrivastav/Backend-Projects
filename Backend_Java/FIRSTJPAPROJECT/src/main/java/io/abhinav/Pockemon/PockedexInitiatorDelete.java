package io.abhinav.Pockemon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PockedexInitiatorDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Abhinav");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        Pockemon p = entityManager.find(Pockemon.class,"Pikachu");
        
        if(p!=null) {
        	entityTransaction.begin();
        	entityManager.remove(p);
        	entityTransaction.commit();
        }
        else {
        	System.out.println("entry does'nt exist");
        }
	}

}
