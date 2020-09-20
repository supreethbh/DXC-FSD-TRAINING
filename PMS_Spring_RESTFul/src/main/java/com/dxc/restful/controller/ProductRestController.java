package com.dxc.restful.controller;

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

import com.dxc.restful.model.Product;
import com.dxc.restful.service.IProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductRestController {

    @Autowired
    IProductService service;
    
    @PostMapping(path="/addProduct", consumes = {"application/json","application/xml"}, produces = {"application/json","application/xml"})
    public Product addProduct(@RequestBody Product product) {
	
	return service.addProduct(product);
    }
    
    @GetMapping(path="/getProduct/{productId}", produces={"application/json","application/xml"})
    public Product getProduct(@PathVariable("productId") int productId) {
	
	return service.getProduct(productId);
    }
    
    @PutMapping(path="/updateProduct", consumes={"application/json","application/xml"})
    public Product updateProduct(@RequestBody Product product) {
	
	return service.updateProduct(product);
    }
    
    @DeleteMapping(path="/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable("productId") int productId) {
	
	service.deleteProduct(productId);
	return "Product_ID : " + productId + " is deleted...." ; 
    }
    
    @GetMapping(path="/getProducts", produces={ "application/json","application/xml"})
    public List<Product> getAllProducts(){
		
	return service.getAllProducts();	
    }
    
    @GetMapping(path="/findByProductName/{productName}", produces={"application/json","application/xml"})
    public Product findByProductName(@PathVariable("productName") String productName) {
	
	return service.findByProductName(productName);	
    }
     
    @GetMapping(path="/findByProductPrice/{productPrice}", produces={ "application/json","application/xml"})
    public Product findByProductPrice(@PathVariable("productPrice") double productPrice) {
	
	return service.findByProductPrice(productPrice);	
    }
    
    @GetMapping(path="/getSorted/{productName}/{productPrice}")
    public  List<Product> findByProductNameSorted(@PathVariable("productName") String productName, 
	    					  @PathVariable("productPrice") Double productPrice) {
			
	return service.findByProductNameSorted(productName, productPrice);	
    }
    
    @GetMapping(path="/priceGreaterThan/{productPrice}")
    public List<Product> findByPriceGreaterThan(@PathVariable("productPrice") Double productPrice){
		
	return service.findByPriceGreaterThan(productPrice);	
    }

}
