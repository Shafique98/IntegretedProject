package com.velociter.hibernate.componentmapping.electronic;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELECTRONIC")
public class ElectronicProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private int productId;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Embedded
	private ProductDetails product = new ProductDetails();
	
	public ElectronicProduct() {}

	public ElectronicProduct(String productName, ProductDetails product) {
		super();
		this.productName = productName;
		this.product = product;
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

	public ProductDetails getProduct() {
		return product;
	}

	public void setProduct(ProductDetails product) {
		this.product = product;
	}
	
	
	
}
