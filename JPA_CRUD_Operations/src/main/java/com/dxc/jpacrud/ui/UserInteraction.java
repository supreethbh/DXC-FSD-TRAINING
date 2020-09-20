package com.dxc.jpacrud.ui;

import com.dxc.jpacrud.entities.Student;
import com.dxc.jpacrud.service.IStudentService;
import com.dxc.jpacrud.service.StudentServiceImpl;

public class UserInteraction {

    public static void main(String[] args) {
	
	System.out.println( "Hello \'JPA-Hibernate CRUD Operation\' World!...." );
	
	IStudentService service = new StudentServiceImpl();
	
	Student student = new Student();
	
	student.setStudentID(generateStudentID());
	student.setStudentName("Sachin");
	
	service.addStudent(student);
	
	System.out.println(student.getStudentName() + " is added to Database...");
	
	//student = service.getStudentById(85771);
	//student.setStudentName("Sachin Tendulkar");	  
	
	//service.updateStudent(student);
	
	//System.out.println(student.getStudentName() + " is updated to Database...");
	
	student = service.getStudentById(935298); 		
	
	//service.removeStudent(student);
	
	//System.out.println(student.getStudentID() + " is removed from Database...");
	
	System.out.println(student);
	
	System.out.println("Tata bye bye \'JPA-Hibernate CRUD Operation\' World!....");		
			
    }
    
    public static long generateStudentID() {
	return (long) (Math.random() * 1000000);
    }
}
