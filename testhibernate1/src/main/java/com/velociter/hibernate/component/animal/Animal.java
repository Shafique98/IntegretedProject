package com.velociter.hibernate.component.animal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANIMAL")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "ANIMAL_NAME",nullable = false)
	private String animalName;
	
	@Column(name = "ANIMAL_BREED",nullable = false)
	private String animalBreed;
	
	@Column(name = "ANIMAL_TYPE",nullable = false)
	private String animalType;
	
	@Column(name = "ANIMAL_WEIGHT",nullable = false)
	private String animalWieght;
	
	@Column(name = "ANIMAL_HEIGHT",nullable = false)
	private String animalHeight;
	
	@Column(name = "ANIMAL_LEGS",nullable = false)
	private int legs;
	
	@Column(name = "ANIMAL_REPROD",nullable = false)
	private String reproductType;
	
	@Column(name = "ANIMAL_DIET",nullable = false)
	private String dietType;
	
	@Column(name = "ANIMAL_FOOD",nullable = false)
	private String food;
	@Column(name = "ANIMAL_LIFE",nullable = false)
	private String lifeSpan;
	@Embedded
	private Domestic domesticAnimal = new Domestic();
	@Embedded
	private Wild wildAnimal = new Wild();
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Animal(String animalName, String animalBreed, String animalType, String animalWieght, String animalHeight,
			int legs, String reproductType, String dietType, String food, String lifeSpan, Domestic domesticAnimal) {
		super();
		this.animalName = animalName;
		this.animalBreed = animalBreed;
		this.animalType = animalType;
		this.animalWieght = animalWieght;
		this.animalHeight = animalHeight;
		this.legs = legs;
		this.reproductType = reproductType;
		this.dietType = dietType;
		this.food = food;
		this.lifeSpan = lifeSpan;
		this.domesticAnimal = domesticAnimal;
	}


	public Animal(String animalName, String animalBreed, String animalType, String animalWieght, String animalHeight,
			int legs, String reproductType, String dietType, String food, String lifeSpan, Wild wildAnimal) {
		super();
		this.animalName = animalName;
		this.animalBreed = animalBreed;
		this.animalType = animalType;
		this.animalWieght = animalWieght;
		this.animalHeight = animalHeight;
		this.legs = legs;
		this.reproductType = reproductType;
		this.dietType = dietType;
		this.food = food;
		this.lifeSpan = lifeSpan;
		this.wildAnimal = wildAnimal;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalBreed() {
		return animalBreed;
	}
	public void setAnimalBreed(String animalBreed) {
		this.animalBreed = animalBreed;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public String getAnimalWieght() {
		return animalWieght;
	}
	public void setAnimalWieght(String animalWieght) {
		this.animalWieght = animalWieght;
	}
	public String getAnimalHeight() {
		return animalHeight;
	}
	public void setAnimalHeight(String animalHeight) {
		this.animalHeight = animalHeight;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getReproductType() {
		return reproductType;
	}
	public void setReproductType(String reproductType) {
		this.reproductType = reproductType;
	}
	public String getDietType() {
		return dietType;
	}
	public void setDietType(String dietType) {
		this.dietType = dietType;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public Domestic getDomesticAnimal() {
		return domesticAnimal;
	}
	public void setDomesticAnimal(Domestic domesticAnimal) {
		this.domesticAnimal = domesticAnimal;
	}
	public Wild getWildAnimal() {
		return wildAnimal;
	}
	public void setWildAnimal(Wild wildAnimal) {
		this.wildAnimal = wildAnimal;
	}
	
	
}
