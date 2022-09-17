package com.velociter.hibernate.componentmapping.student;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "STUDENT_ID")
	private int studentId;
	@Embedded
	private PersonalInformation info=new PersonalInformation();
	@Embedded
	private Address address = new Address();
	@Embedded
	private StudentEducation education = new StudentEducation() ;
	
	public Student() {}
	
	
	public Student(PersonalInformation info) {
		super();
		this.info = info;
	}
	

	public Student(StudentEducation education) {
		super();
		this.education = education;
	}


	public Student(Address address) {
		super();
		this.address = address;
	}


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public PersonalInformation getInfo() {
		return info;
	}

	public void setInfo(PersonalInformation info) {
		this.info = info;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public StudentEducation getEducation() {
		return education;
	}

	public void setEducation(StudentEducation education) {
		this.education = education;
	}
	
}
