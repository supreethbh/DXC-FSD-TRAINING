package com.dxc.pms.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.pms.jpa.entity.Product;
import com.dxc.pms.jpa.service.IProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductRestController {

    @Autowired
    IProductService service;
    
    @PostMapping(path="/add", consumes={"application/json","application/xml"})
    public Product add(@RequestBody Product product) {
		
	return service.addProduct(product);	
    }
    
    @GetMapping(path="/get/{productId}")	
    public Product get(@PathVariable("productId") int productId) {		
	
	return service.getOneProduct(productId);	
    }
    
    @PutMapping(path="/update", consumes={"application/json","application/xml"})	
    public Product update(@RequestBody Product product) {		
	
	return service.updateProduct(product);	
    }
    
    @DeleteMapping(path="/delete/{productID}")
    public String deleteProduct(@PathVariable("productID") int productID) {
	
	service.deleteProduct(productID);		
	return "Product_ID " + productID + " is deleted...";
    }
    
    @GetMapping(path="/findByProductName/{productName}", produces={"application/json","application/xml"})	
    public Product findByProductName(@PathVariable("productName") String productName) {		
	
	return service.findByProductName(productName);	
    }
    
    @GetMapping(path="/getProducts", produces={"application/json","application/xml"})
    public List<Product> getAllProducts() {	
	
	return	service.getAllProducts();	
    }
    
}
