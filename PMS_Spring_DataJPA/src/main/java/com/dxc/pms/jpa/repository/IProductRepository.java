package com.dxc.pms.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dxc.pms.jpa.entity.Product;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {

    public Product findByProductName(String productName);

}
