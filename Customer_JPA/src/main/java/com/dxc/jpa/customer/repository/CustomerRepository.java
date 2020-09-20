package com.dxc.jpa.customer.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dxc.jpa.customer.dbconnection.JPAConnection;
import com.dxc.jpa.customer.entity.Customer;

public class CustomerRepository implements ICustomerRepository {

    private EntityManager entityManager;

    public CustomerRepository() {
	entityManager = JPAConnection.getEntityManager();
    }
    
    @Override
    public void addCustomer(Customer customer) {
	
	entityManager.persist(customer);
    }
    
    @Override
    public void deleteCustomer(int customerID) {
	
	String deleteQuery = " DELETE FROM Customer customer "
			   + " WHERE customer.customerID = : customerId";
	
	TypedQuery<Customer> query = entityManager.createQuery(deleteQuery, Customer.class);
	
	query.setParameter("customerId", customerID).executeUpdate();
    }
    
    @Override
    public List<Customer> getCustomerByCity(String customerCity) {
	
	String selectQuery = " SELECT customer "
		           + " FROM Customer customer "
		           + " WHERE customer.customerCity = : custCity ";
	TypedQuery<Customer> query = entityManager.createQuery(selectQuery, Customer.class);
	
	query.setParameter("custCity", customerCity);
	
	return query.getResultList();
    }
    
    @Override
    public void beginTransaction() {
	entityManager.getTransaction().begin();
    }
    
    @Override
    public void commitTransaction() {
	entityManager.getTransaction().commit();
    }
}
