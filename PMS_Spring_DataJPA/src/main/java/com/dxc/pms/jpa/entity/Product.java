package com.dxc.pms.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Product_ID")
    private int productId;
    
    @Column(name = "Product_Name")
    private String productName;
    
    @Column(name = "Product_Price")
    private double productPrice;

    public int getProductID() {
        return productId;
    }

    public void setProductID(int productID) {
        this.productId = productID;
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
	return "Product [Product_ID = " + productId + ", Product_Name = " + productName + ", "
		+ "Product_Price = " + productPrice + "]";
    }
}
