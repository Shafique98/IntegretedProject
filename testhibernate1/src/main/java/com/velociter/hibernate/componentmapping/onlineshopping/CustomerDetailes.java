package com.velociter.hibernate.componentmapping.onlineshopping;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.velociter.hibernate.componentmapping.customer.Address;
//@Embeddable
public class CustomerDetailes {
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
    private String lastName;
	@Column(name="MOBILE_NO")
    private String mobileNo;
	@Column(name="EMAIL")
    private String email;
    
    private Address address=new Address();
    
    public CustomerDetailes() {}
    
	public CustomerDetailes(String firstName, String lastName, String mobileNo, String email, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
    
}
