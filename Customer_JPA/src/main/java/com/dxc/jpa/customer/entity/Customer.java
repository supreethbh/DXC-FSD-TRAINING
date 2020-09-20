package com.dxc.jpa.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @Column(name = "Customer_ID")
    private int customerID;
    
    @Column(name = "Customer_Name")
    private String customerName;

    @Column(name = "Customer_City")
    private String customerCity;

    @Column(name = "Bill_Amount")
    private double billAmount;

    /* For setting data through setXxx() */
    public Customer() {
	
	super();
    }
    
    public Customer(int customerID, String customerName, String customerCity, double billAmount) {
	super();
	this.customerID = customerID;
	this.customerName = customerName;
	this.customerCity = customerCity;
	this.billAmount = billAmount;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
	return "Customer [Customer_ID = " + customerID + ", Customer_Name = " + customerName + ", Customer_City = "
		+ customerCity + ", Bill_Amount=" + billAmount + "]";
    }
  
}
