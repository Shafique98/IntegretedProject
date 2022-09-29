package com.velociter.hibernate.component.animal;

import javax.persistence.Column;

public class Wild {
	@Column(name ="ANIMAL_PLACE",nullable = false)
	private String place;

	public Wild() {
	}

	public Wild(String place) {
		this.place = place;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
