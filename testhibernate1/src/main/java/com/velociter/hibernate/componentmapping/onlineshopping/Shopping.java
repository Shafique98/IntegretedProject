package com.velociter.hibernate.componentmapping.onlineshopping;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SHOPPING")
public class Shopping {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private long productId;
	@Column(name="PRODUCT_TYPE")
	private String productType;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="PRODUCT_BRAND")
	private String productBrand;
	@Column(name="PRODUCT_COLOUR")
	private String productColour;
	@Column(name="PRODUCT_WEIGHT")
	private String productWeight;
	@Column(name="PRODUCT_PRICE")
	private float productPrice;
	@Column(name="PRODUCT_WARRANTY")
	private String productWarranty;
	/*@Embedded
	private CustomerDetailes customer=new CustomerDetailes();*/
	
	public Shopping() {}

	public Shopping(String productType, String productName, String productBrand, String productColour,
			String productWeight, String productWarranty) {
		super();
		this.productType = productType;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productColour = productColour;
		this.productWeight = productWeight;
		this.productWarranty = productWarranty;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductColour() {
		return productColour;
	}

	public void setProductColour(String productColour) {
		this.productColour = productColour;
	}

	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}


	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductWarranty() {
		return productWarranty;
	}

	public void setProductWarranty(String productWarranty) {
		this.productWarranty = productWarranty;
	}

/*	public CustomerDetailes getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDetailes customer) {
		this.customer = customer;
	}*/
	

}
