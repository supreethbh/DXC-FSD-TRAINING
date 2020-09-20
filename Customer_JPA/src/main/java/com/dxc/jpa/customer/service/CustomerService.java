package com.dxc.jpa.customer.service;

import java.util.List;

import com.dxc.jpa.customer.entity.Customer;
import com.dxc.jpa.customer.repository.CustomerRepository;
import com.dxc.jpa.customer.repository.ICustomerRepository;


public class CustomerService  implements ICustomerService {

    private ICustomerRepository repository;
    
    public CustomerService() {
	repository = new CustomerRepository();
    }
    
    @Override
    public void addCustomer(Customer customer) {
	repository.beginTransaction();
	repository.addCustomer(customer);
	repository.commitTransaction();
    }
    
    @Override
    public void deleteCustomer(int customerID) {
	repository.beginTransaction();
	repository.deleteCustomer(customerID);
	repository.commitTransaction();
    } 
   
    @Override
    public List<Customer> getCustomerByCity(String customerCity) {
	return repository.getCustomerByCity(customerCity);
    }
}
