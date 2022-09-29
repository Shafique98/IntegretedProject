package com.velociter.hibernate.component.order;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOrder {
	public static void main(String[] args) {
		Session session = null;
		try {
			System.out.println("Order");
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			System.out.println("hibernate.cfg.xml");
			session = sf.openSession();
			System.out.println("open session");
			
			Order order = new Order();
			
			order.getItem().setItemName("Mobile");
			order.getItem().setItemPrice(3560f);
			order.getItem().setItemQuantity(2);
			order.getItem().setItemType("Electronics");
			
//			order.getCustomer().setCustomerId(987452);
			order.getCustomer().setCustomerName("Johhny Baba");
			
			order.getCustomer().getAddress().setStreet("ABC");
			order.getCustomer().getAddress().setAreaName("XYZ");
			order.getCustomer().getAddress().setCity("EFG");
			order.getCustomer().getAddress().setState("LMNO");
			order.getCustomer().getAddress().setCountry("Xembowbe");
			order.getCustomer().getAddress().setPinCode(4216942);
			
			session.save(order);

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


//		Order order = new Order(2, new Item("Mobile", "Electronic", 3521.5f, 2),
//		new Customer("Shafeeque", new Address("ABC", "XYZ", "SnowCity", "SnowWhite", "Zembowbe", 123420)));
