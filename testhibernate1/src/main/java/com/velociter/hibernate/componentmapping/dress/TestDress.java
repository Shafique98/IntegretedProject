package com.velociter.hibernate.componentmapping.dress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDress {
			
	public static void main(String[] args) {
			Session session=null; 	//create session object
		
		try {
			System.out.println("Start");
		
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			
			System.out.println("Inserting Records");
			session=sessionfactory.openSession();		//open the session
			//created object of Dress class
			Dress dress=new Dress();
			dress.setDressCode(7);
			dress.setCategory("Boy");
			dress.setDressType("Formal");
			dress.getDd().setDressName("Shirt");
			dress.getDd().setDressBrand("Being Human");
			dress.getDd().setDressColour("White");
			dress.getDd().setDressQuality("Cotton");
			dress.getDd().setDressSize("XL");
			dress.getDd().setDressPrice(500);
			
			session.save(dress);			//save the dress object in hibernate session
			
			Transaction tx = session.beginTransaction();	//begin the transaction
			tx.commit();
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		finally {
			
			session.flush();		//flush the hibernate session	
			session.close();		//close the hibernate session	
		}

	}
	}



