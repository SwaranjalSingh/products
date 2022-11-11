package com.product.product.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Charges {
	@Id 
	private long p_Id;
	private String p_Category;
	private float gst;
	private float delivery;
	
//	public long getP_Id() {
//		return p_Id;
//	}
	public void setP_Id(long p_Id) {
		this.p_Id = p_Id;
	}
//	public String getP_Category() {
//		return p_Category;
//	}
	
	public void setP_Category(String p_Category) {
		this.p_Category = p_Category;
	}
	public long getP_Id() {
		return p_Id;
	}

	public String getP_Category() {
		return p_Category;
	}

	public float getDelivery() {
		return delivery;
	}

	public float getGst() {
		return gst;
	}
	public void setGst(float gst) {
		this.gst = gst;
	}
//	public float getDelivery() {
//		return delivery;
//	}
	public void setDelivery(float delivery) {
		this.delivery = delivery;
	}
}
