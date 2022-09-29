package com.velociter.hibernate.componentmapping.customer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="HOUSE_NO")
	private String houseNo;
	@Column(name="STREET_NAME")
	private String streetName;
	@Column(name="AREA_NAME")
	private String areaName;
	@Column(name="CITY")
	private String city;
	@Column(name="COUNRTY")
	private String country;
	@Column(name="PINCODE")
	private int pinCode;
	
	public Address() {}

	public Address(String houseNo, String streetName, String areaName, String city, String country, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.areaName = areaName;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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