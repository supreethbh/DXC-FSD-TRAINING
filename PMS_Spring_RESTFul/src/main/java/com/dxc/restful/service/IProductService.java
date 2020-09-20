package com.dxc.restful.service;

import java.util.List;

import com.dxc.restful.model.Product;

public interface IProductService {

    public Product addProduct(Product product);
    
    public Product getProduct(int productId);

    public Product updateProduct(Product product);

    public String deleteProduct(int productId);
    
    public List<Product> getAllProducts();

    public Product findByProductName(String productName);
    
    public Product findByProductPrice(double productPrice);
    
    public List<Product> findByPriceGreaterThan(Double productPrice);

    public List<Product> findByProductNameSorted(String productName, Double productPrice);
   
}
