package io.abhinav.Pockemon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PockedexInitiatorRead {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Abhinav");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Replace "Pikachu" with the actual primary key value
        Pockemon p = entityManager.find(Pockemon.class, "Pikachu");

        System.out.println(p);

        // Close the EntityManager
        entityManager.close();
    }
}
