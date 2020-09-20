package com.dxc.JPA_Starter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {
    
    public static void main( String[] args ) {
        
	System.out.println( "Hello \'JPA-Hibernate\' World!" );
	
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager entityManager = factory.createEntityManager();
	
	entityManager.getTransaction().begin();
	
	Student student = new Student();
	
	student.setStudentID(generateStudentID());
	student.setStudentName("Saraswati");
	
	System.out.println(student);
	
	entityManager.persist(student);
	entityManager.getTransaction().commit();
	
	System.out.println(student.getStudentName() + "'s data is added to Database...");
	
	entityManager.close();
	factory.close();
	
	System.out.println("Tata bye bye \'JPA-Hibernate\' World!....");
    }
    
    public static long generateStudentID() {
	return (long) (Math.random() * 1000000);
    }
}
