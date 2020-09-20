package com.dxc.pms.spring.swagger.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Product_Management")
public class ProductManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @ApiModelProperty(notes="Product ID")
    @Column(name = "Product_Id", nullable = false)
    private int productId;
    
    @ApiModelProperty(notes="Product Name")
    @Column(name = "Product_Name", nullable = false)
    private String productName;
    
    @ApiModelProperty(notes="Product Price")
    @Column(name = "Product_Price", nullable = false)
    private double productPrice;

    public ProductManagement() {
	super();
    }
    
    public ProductManagement(int productId, String productName, double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
	return "ProductManagement [Product_Id=" + productId + ", Product_Name=" + productName + 
		", Product_Price=" + productPrice + "]";
    }
    
}
