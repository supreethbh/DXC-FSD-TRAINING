package com.dxc.jpa.customer.service;

import java.util.List;

import com.dxc.jpa.customer.entity.Customer;

public interface ICustomerService {

    public void addCustomer(Customer customer);
    
    public void deleteCustomer(int customerID);
    
    public List<Customer> getCustomerByCity(String customerCity);
    
}
