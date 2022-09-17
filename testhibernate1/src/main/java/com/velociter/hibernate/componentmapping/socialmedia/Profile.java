package com.velociter.hibernate.componentmapping.socialmedia;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Profile {
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="MOBILE_NAME")
	private String mobileNumber;
	@Column(name="EMAIL")
	private String email;
	@Column(name="DATE_OF_BIRTH")
	private String dob;
	
	public Profile() {}

	public Profile(String firstName, String lastName, String mobileNumber, String email, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.dob = dob;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
