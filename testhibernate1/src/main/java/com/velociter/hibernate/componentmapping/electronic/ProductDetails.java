package com.velociter.hibernate.componentmapping.electronic;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductDetails {
	@Column(name = "BRAND")
	private String brand;
	@Column(name = "COLOUR")
	private String colour;
	@Column(name = "WARRANTY")
	private String warranty;
	@Column(name = "SPECIAL_FEATURE")
	private String specialFeature;
	@Column(name = "PRODUCT_WEIGHT")
	private String productWeight;
	@Column(name = "PRICE")
	private float price;
	
	public ProductDetails() {}

	public ProductDetails(String brand, String colour, String warranty, String specialFeature, String productWeight,
			float price) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.warranty = warranty;
		this.specialFeature = specialFeature;
		this.productWeight = productWeight;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getSpecialFeature() {
		return specialFeature;
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}

	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
}
