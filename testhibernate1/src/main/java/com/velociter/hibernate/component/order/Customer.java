package com.velociter.hibernate.component.order;

import javax.persistence.Column;
import javax.persistence.Embedded;

public class Customer {
//	@Column
//	private long customerId;
	@Column(name="CUSTOMER_NAME",nullable = false)
	private String customerName;
	@Embedded
	private Address address = new Address();

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}


/*0
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
*/
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
