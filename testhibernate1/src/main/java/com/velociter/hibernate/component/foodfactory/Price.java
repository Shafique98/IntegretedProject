package com.velociter.hibernate.component.foodfactory;

import javax.persistence.Column;

public class Price {

	@Column(name = "DISH_PRICE",nullable = false)
	private float dishPrice;

	@Column(name = "DISH_GST",nullable = false)
	private float gst;

	@Column(name = "DISH_DISCOUNT",nullable = false)
	private float dishDiscount;

	@Column(name = "DISH_TOTAL",nullable = false)
	private float total;

	public Price() {
	}

	public Price(float dishPrice, float gst, float dishDiscount, float total) {
		this.dishPrice = dishPrice;
		this.gst = gst;
		this.dishDiscount = dishDiscount;
		this.total = total;
	}

	public float getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(float dishPrice) {
		this.dishPrice = dishPrice;
	}

	public float getGst() {
		return gst;
	}

	public void setGst(float gst) {
		this.gst = gst;
	}

	public float getDishDiscount() {
		return dishDiscount;
	}

	public void setDishDiscount(float dishDiscount) {
		this.dishDiscount = dishDiscount;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
}