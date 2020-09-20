package com.dxc.pms.jpa.service;

import java.util.List;

import com.dxc.pms.jpa.entity.Product;

public interface IProductService {

    	public Product addProduct(Product product);
	
	public Product getOneProduct(int productId);

	public Product updateProduct(Product product);
	
	public String deleteProduct(int productID);

	public List<Product> getAllProducts();

	public Product findByProductName(String productName);
	
}
