package com.velociter.hibernate.componentmapping.customer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonalQualification {
	@Column(name="COLLEGE_STUDIED",nullable = false)
	private String collegeStudied=null;
	@Column(name="QUALIFICATION",nullable = false)
	private String qualification=null;
	
	public PersonalQualification() {}

	public PersonalQualification(String collegeStudied, String qualification) {
		super();
		this.collegeStudied = collegeStudied;
		this.qualification = qualification;
	}

	public String getCollegeStudied() {
		return collegeStudied;
	}

	public void setCollegeStudied(String collegeStudied) {
		this.collegeStudied = collegeStudied;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
}
