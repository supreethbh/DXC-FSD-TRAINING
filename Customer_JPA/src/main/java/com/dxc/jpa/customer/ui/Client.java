package com.dxc.jpa.customer.ui;

import java.util.Scanner;

import com.dxc.jpa.customer.entity.Customer;
import com.dxc.jpa.customer.service.CustomerService;
import com.dxc.jpa.customer.service.ICustomerService;

public class Client {

    public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	
	ICustomerService service = new CustomerService();
	
	Customer customer = new Customer();
	System.out.println("\n\n\n");
	System.out.println("Welcome to Customer Portal, Please Select Your choice");
	
	System.out.println("1. Insert ");
	System.out.println("2. Delete Based On Customer_ID");
	System.out.println("3. View Customer Details Based On City \n");
	
	
	System.out.println("Please select the choice");
	int choice = scanner.nextInt();
	
	
	switch (choice) {
	
        	case 1:
        	    System.out.println("------------ Add Customer details ------------\n");
        	    
        	    System.out.println("Enter Customer Name");
        	    String customerName = scanner.next();
        	    
        	    scanner.nextLine();
        	    
        	    System.out.println("Enter Customer City");
        	    String customerCity = scanner.nextLine();
        	    
        	    System.out.println("Enter Customer Bill");
        	    double billAmount = scanner.nextDouble();
        	    
        	    customer = new Customer(generateCustomerID(), customerName, customerCity, billAmount);
        	    
        	    service.addCustomer(customer);
        	    
        	    System.out.println(customer.getCustomerName() + " is added to Database...");
        	    System.out.println(customer);
        	    
        	    break;
        
        	case 2:
        	    System.out.println("------------ Delete Customer Based on Customer_ID ------------\n");
        	    
        	    System.out.println("Enter Customer_ID");
        	    int customerId = scanner.nextInt();
        	    
        	    service.deleteCustomer(customerId);
        	    System.out.println(customerId + " is removed from Database...");
        	    
        	    break;
        	    
        	case 3:
        	    System.out.println("------------ View Customer Based on Customer_City ------------\n");
        	    
        	    System.out.println("Enter Customer City");
        	    String customerCity1 = scanner.next();
        	    
        	    service.getCustomerByCity(customerCity1);
        	    
        	    for (Customer customer2 : service.getCustomerByCity(customerCity1)) {
			System.out.println(customer2);
			System.out.println();
        	    }   
        	    
        	    break;
        	    
        	default:
        	    
        	    System.err.println("Invalid Request....");
        	    break;
	}
    }
    
    /* To generate random Customer_Id using  */
    public static int generateCustomerID() {
	return (int) (Math.random() * 10000);
    }
}
