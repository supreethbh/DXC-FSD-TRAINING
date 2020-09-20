package com.dxc.pms.spring.swagger.service;

import java.util.List;

import com.dxc.pms.spring.swagger.model.ProductManagement;

public interface IProductService {

    public ProductManagement insertProductDetails(ProductManagement product);

    public ProductManagement updateProductDetails(ProductManagement product);

    public void deleteProduct(int productId);
    
    public ProductManagement getProductDetailsById(int productId);

    public List<ProductManagement> getAllProducts();

    public List<ProductManagement> getProductDetailsByPrice(Double productPrice);

    public List<ProductManagement> getProductDetailsByName(String productName);

}
