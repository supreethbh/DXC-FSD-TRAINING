package com.dxc.pms.spring.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.pms.spring.swagger.model.ProductManagement;
import com.dxc.pms.spring.swagger.service.IProductService;

import io.swagger.annotations.ApiOperation;

@ApiOperation(value="/product", tags="Product-Controller with Spring-Rest-Swagger")
@RestController
@RequestMapping(path="/product")
@CrossOrigin(origins="http://localhost:5000")
public class ProductRestController {

    @Autowired
    private IProductService service;
    
    @RequestMapping("/login")
    public String loginPage() {
	return "Login Successfull..!";
    }

    @ApiOperation(value = "Add Product Details", response = ProductManagement.class)
    @PostMapping(path="/insert", consumes={"application/json","application/xml"})
    public ProductManagement insertProductDetails(@RequestBody ProductManagement product) {
	return service.insertProductDetails(product);
    }
    
    @ApiOperation(value = "Update Product Details", response = ProductManagement.class)
    @PutMapping(path="/update", consumes={"application/json","application/xml"})
    public ProductManagement updateProduct(@RequestBody ProductManagement product) {
	return service.updateProductDetails(product);
    }
    
    @ApiOperation(value = "Delete Product Details", response = ProductManagement.class)
    @DeleteMapping(path="/delete/{productId}")
    public String deleteProduct(@PathVariable("productId") int productId) {
	service.deleteProduct(productId);
	return "Product of ID: " + productId + " is Deleted..!";
    }
    
    @ApiOperation(value = "Find Product based on Id", response = ProductManagement.class)
    @GetMapping(path="/getProductById/{productId}", produces={"application/json","application/xml"})
    public ProductManagement getProductDetailsById(@PathVariable("productId") int productId) {	
	return service.getProductDetailsById(productId);
    }
    
    @ApiOperation(value = "Find Product based on Name", response = ProductManagement.class)
    @GetMapping(path="/getProductByName/{productName}", produces={"application/json","application/xml"})
    public List<ProductManagement> getProductDetailsByName(@PathVariable("productName") String productName) {	
	return service.getProductDetailsByName(productName);
    }
    
    @ApiOperation(value = "Find Product based on Price", response = ProductManagement.class)
    @GetMapping(path="/getProductByPrice/{productPrice}", produces={"application/json","application/xml"})
    public List<ProductManagement> getProductDetailsByPrice(@PathVariable("productPrice") Double productPrice) {	
	return service.getProductDetailsByPrice(productPrice);
    }
    
    @ApiOperation(value = "Get All Product-Details", response = ProductManagement.class)
    @GetMapping(path="/getProducts", produces={"application/json","application/xml"})
    public List<ProductManagement> getAllProducts() {
	return service.getAllProducts();	
    }
    
}
