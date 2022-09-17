package com.velociter.hibernate.componentmapping.customer;

import java.util.Date;

import org.hibernate.mapping.Set;

public class Person {
	private java.util.Date birthdate;
    private Name name; 
    private PersonalQualification personQualification;
    private int id;
     
    public Person() {}

	public Person(Date birthdate, Name name, PersonalQualification personQualification, int id) {
		super();
		this.birthdate = birthdate;
		this.name = name;
		this.personQualification = personQualification;
		this.id = id;
	}

	public java.util.Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(java.util.Date birthdate) {
		this.birthdate = birthdate;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PersonalQualification getPersonQualification() {
		return personQualification;
	}

	public void setPersonQualification(PersonalQualification personQualification) {
		this.personQualification = personQualification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
}
