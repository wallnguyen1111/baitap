package org.example.demo33;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.annotation.WebServlet;
import org.example.demo33.buoi6.entity.Student;


public class Main {
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

       EntityManager em = emf.createEntityManager();
        System.out.println("Done...");
        em.createNativeQuery("SELECT * FROM students", Student.class).getResultList().forEach(System.out::println);

        em.createQuery("select s from Student s", Student.class).getResultList().forEach(System.out::println);
    }

}
