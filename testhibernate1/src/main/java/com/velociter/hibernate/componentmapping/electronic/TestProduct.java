package com.velociter.hibernate.componentmapping.electronic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestProduct {

	public static void main(String[] args) {
	Session session=null;
		
		try {
			System.out.println("Start");
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			System.out.println("Inserting Records");
			session=sessionfactory.openSession();
			
			ElectronicProduct elect=new ElectronicProduct();
			elect.setProductName("AirConditioner");
			elect.getProduct().setBrand("Daikin");
			elect.getProduct().setColour("White");
			elect.getProduct().setSpecialFeature("Dust Filter");
			elect.getProduct().setProductWeight("35kg");
			elect.getProduct().setWarranty("1 year");
			elect.getProduct().setPrice(35000);
			session.save(elect);
			Transaction tx = session.beginTransaction();	
			tx.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			
			session.flush();
			session.close();			
		}

	}


	}

