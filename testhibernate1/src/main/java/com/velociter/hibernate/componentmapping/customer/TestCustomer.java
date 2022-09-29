package com.velociter.hibernate.componentmapping.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCustomer {
	public static void main(String[] args) {
		Session session = null;
		System.out.println("above try");

		try {
			System.out.println("inside try");
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("inside try");
			session = sessionFactory.openSession(); // Open the session
		

			Customer customer = new Customer();
		//	customer.getName().setInitial('V');
			customer.setFirst("raja");
			customer.setLast("Khan"); 
			customer.setMobileNo("123");
			customer.getAddress().setHouseNo("GV909");
			customer.getAddress().setStreetName("Street");
			customer.getAddress().setAreaName("Area");
			customer.getAddress().setCity("indore");
			customer.getAddress().setCountry("india");
			customer.getAddress().setPinCode(3456);

			session.save(customer); // Save the contact object in hibernate session

			Transaction tx = session.beginTransaction(); // begin the transaction
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			session.flush(); // flush the hibernate session
			session.close(); // Close the hibernate session
		}

	}

}
