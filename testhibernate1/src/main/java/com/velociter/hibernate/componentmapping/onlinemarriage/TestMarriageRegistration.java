package com.velociter.hibernate.componentmapping.onlinemarriage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.velociter.hibernate.componentmapping.customer.Address;
import com.velociter.hibernate.componentmapping.customer.Customer;
import com.velociter.hibernate.componentmapping.customer.Name;
import com.velociter.hibernate.componentmapping.customer.PersonalQualification;

public class TestMarriageRegistration {

	public static void main(String[] args) {

		Session session = null;
		try {
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("inside try");
			session = sessionFactory.openSession(); // Open the session

			MarriageRegistration marriage=new MarriageRegistration(); 
			marriage.setFirstName("kefiya");
			marriage.setLastName("shekh");
			marriage.setMotherName("afMom");
			marriage.setFatherName("afDad");
			marriage.setReligion("islam");
			marriage.setCast("genral");
			marriage.setMobileNo("5678");
			marriage.setEmail("afiya@gmail.com");
			marriage.setJob("lawyer");
			marriage.setSalary(50000f);
			marriage.setGender("female");
			marriage.setHeight("5.5feet");
			marriage.setWeight("50kg");
			
			
			marriage.setQualification(new PersonalQualification("aaa","LLB"));

			marriage.getAddress().setHouseNo("gh98");
			marriage.getAddress().setStreetName("1 Street");
			marriage.getAddress().setAreaName("1 Area");
			marriage.getAddress().setCity("indore");
			marriage.getAddress().setCountry("india");
			marriage.getAddress().setPinCode(8765);
			
			session.save(marriage); // Save the contact object in hibernate session

			Transaction tx = session.beginTransaction(); // begin the transaction
			tx.commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			session.flush(); // flush the hibernate session
			session.close(); // Close the hibernate session
		}

	}

}
