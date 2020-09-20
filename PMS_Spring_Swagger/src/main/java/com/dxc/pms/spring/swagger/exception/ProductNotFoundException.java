package com.dxc.pms.spring.swagger.exception;

public class ProductNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public ProductNotFoundException(int productId) {

	super("Product Not Found For this Product_ID :: " + productId);
    }
    
}
