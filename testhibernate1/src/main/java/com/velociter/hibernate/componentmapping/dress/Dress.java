package com.velociter.hibernate.componentmapping.dress;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DRESSES")
public class Dress {
	//declare the fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="DRESSCODE")
	private int dressCode; 
	@Column(name = "CATEGORY")
	private String category;
	@Column(name = "DRESSTYPE")
	private String dressType;
	@Embedded
	private DressDetails dd = new DressDetails(); //made a component of class dressDetails
	
	//create default constructor
	public Dress() {}
	//create parameterized constructor
	public Dress(String category, String dressType, DressDetails dd) {
		super();
		this.category = category;
		this.dressType = dressType;
		this.dd = dd;
	}
	//created getter and setter for fields
	public int getDressCode() {
		return dressCode;
	}

	public void setDressCode(int dressCode) {
		this.dressCode = dressCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDressType() {
		return dressType;
	}

	public void setDressType(String dressType) {
		this.dressType = dressType;
	}

	public DressDetails getDd() {
		return dd;
	}

	public void setDd(DressDetails dd) {
		this.dd = dd;
	}

	
}
