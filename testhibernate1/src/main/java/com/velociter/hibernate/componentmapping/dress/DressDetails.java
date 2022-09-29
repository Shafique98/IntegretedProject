package com.velociter.hibernate.componentmapping.dress;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class DressDetails {
	@Column(name = "DRESS_NAME")
	private String dressName;
	@Column(name = "DRESS_BRAND")
	private String dressBrand;
	@Column(name = "DRESS_QUALITY")
	private String dressQuality;
	@Column(name = "DRESS_SIZE")
	private String dressSize;
	@Column(name = "DRESS_COLOUR")
	private String dressColour;
	@Column(name = "DRESS_PRICE")
	private float dressPrice;
	
	public DressDetails() {}


	public DressDetails(String dressName, String dressBrand, String dressQuality, String dressSize,
			String dressColour) {
		super();
		this.dressName = dressName;
		this.dressBrand = dressBrand;
		this.dressQuality = dressQuality;
		this.dressSize = dressSize;
		this.dressColour = dressColour;
	}

	public String getDressName() {
		return dressName;
	}

	public void setDressName(String dressName) {
		this.dressName = dressName;
	}

	public String getDressBrand() {
		return dressBrand;
	}

	public void setDressBrand(String dressBrand) {
		this.dressBrand = dressBrand;
	}

	public String getDressQuality() {
		return dressQuality;
	}

	public void setDressQuality(String dressQuality) {
		this.dressQuality = dressQuality;
	}

	public String getDressSize() {
		return dressSize;
	}

	public void setDressSize(String dressSize) {
		this.dressSize = dressSize;
	}

	public String getDressColour() {
		return dressColour;
	}

	public void setDressColour(String dressColour) {
		this.dressColour = dressColour;
	}

	public float getDressPrice() {
		return dressPrice;
	}

	public void setDressPrice(float dressPrice) {
		this.dressPrice = dressPrice;
	}
  	
}
