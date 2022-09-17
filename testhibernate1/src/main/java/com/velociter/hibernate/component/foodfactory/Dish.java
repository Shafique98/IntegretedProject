package com.velociter.hibernate.component.foodfactory;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Dish {

	@Column(name="DISH_NAME",nullable = false)
	private String dishName;
	
	@Column(name = "DISH_TYPE",nullable = false)
	private String dishType;
	
	public Dish() {	}

	public Dish(String dishName, String dishType) {
		super();
		this.dishName = dishName;
		this.dishType = dishType;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishType() {
		return dishType;
	}

	public void setDishType(String dishType) {
		this.dishType = dishType;
	}
	
}
