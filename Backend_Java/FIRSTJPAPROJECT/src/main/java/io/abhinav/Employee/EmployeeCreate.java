package io.abhinav.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeCreate {
    public static void main(String[] args) {
        // Creating employee table
        Employee E1 = new Employee();
        E1.setName("Abhinav");
        E1.setId(1);

        // Creating employee_id_card table
        EmployeeIdCard EIC1 = new EmployeeIdCard();
        EIC1.setCardId(101);
        EIC1.setJobLocation("Bangalore");
        
        // Establishing the relationship
        E1.setEmployeeIdCard(EIC1);
        EIC1.setEmployee(E1);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(E1);
        entityManager.persist(EIC1);
        entityTransaction.commit();

        // Retrieving Employee with EmployeeIdCard
        Employee retrievedEmployee = entityManager.find(Employee.class, 1);
        EmployeeIdCard retrievedCard = retrievedEmployee.getEmployeeIdCard();

        System.out.println("Retrieved Employee: " + retrievedEmployee);
        System.out.println("Retrieved EmployeeIdCard: " + retrievedCard);
    }
}
