package com.velociter.hibernate.componentmapping.onlinemarriage;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.velociter.hibernate.componentmapping.customer.Address;
import com.velociter.hibernate.componentmapping.customer.PersonalQualification;
@Entity
@Table(name="MARRIAGE_REGISTRATION")
public class MarriageRegistration {
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="MOTHER_NAME")
	private String motherName;
	@Column(name="FATHER_NAME")
	private String fatherName;
	@Column(name="Religion")
	private String religion;
	@Column(name="Cast")
	private String cast;
	@Column(name="MOBILE_NO")
	private String mobileNo;
	@Column(name="Email")
	private String email;
	@Embedded
	private PersonalQualification qualification=new PersonalQualification();
	@Embedded
	private Address address = new Address();
	@Column(name="Job")
	private String job;
	@Column(name="Salary")
	private float salary;
	@Column(name="Date_Of_Birth")
	private String dob;

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	@Column(name="Gender")
	private String gender;
	@Column(name="Height")
	private String height;
	@Column(name="Weight")
	private String weight;
	

	public MarriageRegistration() {}

	public MarriageRegistration(String firstName, String lastName, String religion, PersonalQualification qualification,
			String job, float salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.religion = religion;
		this.qualification = qualification;
		this.job = job;
		this.salary = salary;
	}
	public MarriageRegistration(String firstName, String lastName, String religion, String cast, String job,
			float salary, String gender, String height, String weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.religion = religion;
		this.cast = cast;
		this.job = job;
		this.salary = salary;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
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

	public PersonalQualification getQualification() {
		return qualification;
	}

	public void setQualification(PersonalQualification qualification) {
		this.qualification = qualification;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}