package com.velociter.hibernate.component.ticket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTicket {

	public static void main(String[] args) {
		Session session=null;
		
		try {
			System.out.println("Start");
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			System.out.println("Inserting Records");
			session=sessionfactory.openSession();
			
			MovieTicket tickets=new MovieTicket("Bollywood",new Ticket("ABCD","9:00 to 12:00","gold", 250));
			
			session.save(tickets);
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
