package com.velociter.hibernate.componentmapping.student;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "House_No")
	private String houseNo;
	@Column(name = "STREET_NAME")
	private String street;
	@Column(name = "CITY")
	private String city;
	@Column(name = "PINCODE")
	private int pincode;
	@Column(name = "STATE_NAME")
	private String state;
	
	
	public Address() {}
	
	
	public Address(String houseNo, String street, String city, int pincode, String state) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}


	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
