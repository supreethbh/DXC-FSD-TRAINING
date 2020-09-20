package com.dxc.restful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.restful.exception.ProductNotFoundException;
import com.dxc.restful.model.Product;
import com.dxc.restful.repository.IProductRepository;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepository repository;
    
    @Override
    public Product addProduct(Product product) {
	
	return repository.save(product);
    }

    @Override
    public Product getProduct(int productId) {
	
	return repository.findById(productId)
		         .orElseThrow(() -> new ProductNotFoundException(productId));
    }

    @Override
    public Product updateProduct(Product product) {
	
	return repository.save(product);
    }

    @Override
    public String deleteProduct(int productId) {

	repository.deleteById(productId);
	return "Product_ID : " + productId + " is deleted...." ;
    } 
    
    @Override
    public List<Product> getAllProducts() {
	
	return repository.findAll();
    }

    @Override
    public Product findByProductName(String productName) {
	
	return repository.findByProductName(productName);
    }

    @Override
    public Product findByProductPrice(double productPrice) {
	
	return repository.findByProductPrice(productPrice);
    }

    @Override
    public List<Product> findByProductNameSorted(String productName, Double productPrice) {
	
	return repository.findByProductNameSorted(productName, productPrice);
    }

    @Override
    public List<Product> findByPriceGreaterThan(Double productPrice) {
	
	return repository.findByPriceGreaterThan(productPrice);
    }
    
}
