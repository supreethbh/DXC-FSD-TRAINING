package com.dxc.jpa.customer.repository;

import java.util.List;

import com.dxc.jpa.customer.entity.Customer;

public interface ICustomerRepository {

    public void addCustomer(Customer customer);
    
    public void deleteCustomer(int customerID);
    
    public List<Customer> getCustomerByCity(String customerCity);
    
    public void beginTransaction();
    
    public void commitTransaction();
    
}
