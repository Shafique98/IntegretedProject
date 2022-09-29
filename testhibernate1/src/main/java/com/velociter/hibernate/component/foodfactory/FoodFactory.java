package com.velociter.hibernate.component.foodfactory;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOOD_FACTORY")
public class FoodFactory {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "DISHID",nullable = false)
	private long id;
	@Embedded
	private Dish dish = new Dish();
	@Embedded
	private Price price = new Price();

	public FoodFactory() {
	}

	public FoodFactory(Dish dish, Price price) {
		super();
		this.dish = dish;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
}
