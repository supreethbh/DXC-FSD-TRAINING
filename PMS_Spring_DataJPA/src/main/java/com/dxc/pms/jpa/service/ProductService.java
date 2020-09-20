package com.dxc.pms.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.pms.jpa.entity.Product;
import com.dxc.pms.jpa.repository.IProductRepository;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepository repository;
    
    Product product;
    
    @Override
    public Product addProduct(Product product) {
	
	return repository.save(product);
    }

    @Override
    public Product getOneProduct(int productId) {
	
	return repository.findById(productId).orElse(product);
    }

    @Override
    public Product updateProduct(Product product) {
	
	return repository.save(product);
    }
    
    @Override
    public String deleteProduct(int productID) {
	
	repository.deleteById(productID);
	return null;
    }

    @Override
    public List<Product> getAllProducts() {
	
	return (List<Product>) repository.findAll();
    }

    @Override
    public Product findByProductName(String productName) {
	
	return repository.findByProductName(productName);
    }
    
}
