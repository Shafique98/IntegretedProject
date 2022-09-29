package com.velociter.hibernate.componentmapping.movie;

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
			
			MovieTicket ticket=new MovieTicket();
			ticket.setMovieType("Hollywood");
			ticket.getTckt().setMovieName("Angry Bird");
			ticket.getTckt().setMovieTime("12:00pmTo3:00pm");
			ticket.getTckt().setScreenNo(3);
			ticket.getTckt().setSeatType("Platinum");
			ticket.getTckt().setSeatNum("A1");
			ticket.getTckt().setPrice(250);
			
			session.save(ticket);
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
