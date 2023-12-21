package io.abhinav.Pockemon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PockedexInitiator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Pockemon p1 = new Pockemon();
          p1.setName("Pikachu");
          p1.setPower(1000);
          p1.setType("electrical");
          
          Pockemon p2 = new Pockemon();
          p2.setName("Pikanu");
          p2.setPower(1100);
          p2.setType("electric");
          
          
          //Pockemon --------> table
          //name, power, type ---------> columns
          //p1 object -------> data
          
          EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Abhinav");
          EntityManager entityManager = entityManagerFactory.createEntityManager();
          EntityTransaction entityTransaction = entityManager.getTransaction();
          
          entityTransaction.begin();
          entityManager.persist(p2);
          entityManager.persist(p1);
          entityTransaction.commit();
          } 

}
