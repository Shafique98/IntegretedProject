package com.velociter.hibernate.componentmapping.student;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonalInformation {
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "FATHER_NAME")
	private String fatherName;
	@Column(name = "MOTHER_NAME")
	private String motherName;
	@Column(name = "EMAIL_ID")
	private String email;
	@Column(name = "CONTACT")
	private String contact;
	
	public PersonalInformation() {}

	public PersonalInformation(String firstName, String lastName, String email, String contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
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

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
