package com.dxc.pms.spring.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.pms.spring.swagger.exception.ProductNotFoundException;
import com.dxc.pms.spring.swagger.model.ProductManagement;
import com.dxc.pms.spring.swagger.repository.IProductRepository;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository repository;
    
    @Override
    public ProductManagement insertProductDetails(ProductManagement product) {
	return repository.save(product);
    }

    @Override
    public ProductManagement updateProductDetails(ProductManagement product) {
	return repository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
	repository.deleteById(productId);
    }

    @Override
    public List<ProductManagement> getAllProducts() {
	return repository.findAll();
    }

    @Override
    public ProductManagement getProductDetailsById(int productId) {
	return repository.findById(productId)
		 .orElseThrow(() -> new ProductNotFoundException(productId));
    }

    @Override
    public List<ProductManagement> getProductDetailsByPrice(Double productPrice) {
	return repository.getProductDetailsByPrice(productPrice);
    }

    @Override
    public List<ProductManagement> getProductDetailsByName(String productName) {
	return repository.getProductDetailsByName(productName);
    }
    
}
