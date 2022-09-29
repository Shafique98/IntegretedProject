package com.velociter.hibernate.component.order;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="STREET",nullable = false)
	private String street;
	@Column(name = "AREA",nullable = false)
	private String areaName;
	@Column(name = "CITY",nullable = false)
	private String city;
	@Column(name = "STATE",nullable = false)
	private String state;
	@Column(name = "COUNTRY",nullable = false)
	private String country;
	@Column(name = "PINCODE",nullable = false)
	private int pinCode;
	
	public Address() {}
	
	public Address(String street, String areaName, String city, String state, String country, int pinCode) {
		super();
		this.street = street;
		this.areaName = areaName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}


	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
}
