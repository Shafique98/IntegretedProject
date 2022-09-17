package com.velociter.hibernate.component.animal;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class TestAnimal {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			Animal animal = new Animal();
				
			animal.setId(25);
			animal.setAnimalName("DOG");
			animal.setAnimalType("Domeestic");
			animal.setAnimalBreed("Dalmation");
			animal.setAnimalWieght("6.1kg");
			animal.setAnimalHeight("2-3 feet");
			animal.setLegs(4);
			animal.setReproductType("Viviparous");
			animal.setFood("Non-veg");
			animal.setDietType("Carnivores");
			animal.setLifeSpan("9-10 yrs");
			animal.getDomesticAnimal().setPurposeOfCapturing("Takes care of house and themself also");
			animal.getWildAnimal().setPlace("Homes");
			Animal animal2 = new Animal();
			animal2.setAnimalName("Tiger");
			animal2.setAnimalType("Sumatran");
			animal2.setAnimalBreed("Wild");
			animal2.setAnimalWieght("25-40kg");
			animal2.setAnimalHeight("4-6 feet");
			animal2.setLegs(4);
			animal2.setReproductType("Viviparous");
			animal2.setFood("Non-veg");
			animal2.setDietType("Carnivores");
			animal2.setLifeSpan("10-20 yrs");
			animal2.getDomesticAnimal().setPurposeOfCapturing("Strength");
			animal2.getWildAnimal().setPlace("Forest");;
			
			session.save(animal);
			session.save(animal2);
			Transaction tx = session.beginTransaction();
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.flush();
				session.close();
			}
		}
	}

}

//Animal animal = new Animal("Dog", "Dalmation", "Domestic", "6.0kg", "2.4feet", 4, "Viviparous", "Non-Veg",
//"Carnivores", "9-10 yrs", new Domestic("Take care of house"));

//Animal animal2 = new Animal("Tiger", "Sumatran", "Wild", "25-35kg", "4-5feet", 4, "Viviparous", "Non-Veg",
//		"Carnivores", "8-10 yrs", new Wild("Forest"));

