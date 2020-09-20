package com.dxc.pms.spring.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dxc.pms.spring.swagger.model.ProductManagement;

@EnableJpaRepositories
public interface IProductRepository extends JpaRepository<ProductManagement, Integer> {

    @Query(" SELECT product " 
	 + " FROM ProductManagement product "
	 + " WHERE  product.productPrice = ?1 "
	 + " ORDER BY product.productPrice ")
    public List<ProductManagement> getProductDetailsByPrice(Double productPrice);

    @Query(" SELECT product " 
	 + " FROM ProductManagement product " 
	 + " WHERE  product.productName = ?1 "
	 + " ORDER BY product.productName ")
    public List<ProductManagement> getProductDetailsByName(String productName);
}
