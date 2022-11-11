package com.product.product.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	private long productId;
	private	String productName;
	private String productType;
	private	String productCategory;
	private double productPrice;
	private double discount;
	private double finalPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Charges charges;
	
	public Product(long productId, String productName, String productType, String productCategory, double productPrice,
			Charges charges) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.charges = charges;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public Charges getCharges() {
		return charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productCategory=" + productCategory + ", productPrice=" + productPrice + ", charges=" + charges
				+ "]";
	}

	
	

}
