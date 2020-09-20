package com.dxc.restful.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dxc.restful.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    public Product findByProductName(String productName);
    
    public Product findByProductPrice(double productPrice);

    @Query(" SELECT product "
    	 + " From Product product WHERE product.productPrice > ?1 "
    	 + " ORDER BY product.productPrice DESC ")
    public List<Product> findByPriceGreaterThan(Double productPrice);
    
    @Query(" SELECT product "
    	 + " FROM Product product "
    	 + " WHERE  product.productName = ?1 OR product.productPrice >= ?2 "
    	 + " ORDER BY product.productPrice ")
    public List<Product> findByProductNameSorted(String productName, Double productPrice);
    
}
