package com.dxc.restful.exception;

public class ProductNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public ProductNotFoundException(Integer productId) {
	
	super("Could not find product " + productId);
    }
    
}
