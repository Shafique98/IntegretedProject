package com.velociter.hibernate.componentmapping.onlineshopping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestShopping {
	public static void main(String[] args) {
		Session session = null;

		try {
			
			SessionFactory sessionF=new Configuration().configure().buildSessionFactory();
			System.out.println("under try");
			session = sessionF.openSession();
			
			Shopping shop=new Shopping();
			
			shop.setProductType("toys");
			shop.setProductName("car");
			shop.setProductBrand("a1");
			shop.setProductColour("blak");
			shop.setProductWeight("500gm");
			shop.setProductPrice(150f);
			shop.setProductWarranty("no warranty");
		/*	shop.getCustomer().setEmail("jim@gmail.com");
			shop.getCustomer().setFirstName("Jim");
			shop.getCustomer().setLastName("Jain");
			shop.getCustomer().setMobileNo("098765");
			shop.getCustomer().getAddress().setHouseNo("l300");
			shop.getCustomer().getAddress().setStreetName("new street");
			shop.getCustomer().getAddress().setAreaName("new area");
			shop.getCustomer().getAddress().setCity("indore");
			shop.getCustomer().getAddress().setCountry("india");
			shop.getCustomer().getAddress().setPinCode(9876);  */
			
			session.save(shop);
			
			Transaction tran=session.beginTransaction();
			tran.commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			session.flush();
			session.close();
		}

	}

}
