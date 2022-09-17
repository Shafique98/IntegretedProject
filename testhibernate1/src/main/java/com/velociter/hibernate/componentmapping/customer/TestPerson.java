package com.velociter.hibernate.componentmapping.customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date; 
public class TestPerson {

		public static void main(String[] args) {
			Session session = null;
			System.out.println("----loading hibernate.cfg.xml---");
			
 
			try {
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				
				session = sessionFactory.openSession();      // Open the session
				System.out.println("****Inserting Records*****");
				
				Person person=new Person(); 
				
/*				person.setName(new Name('D',"Danish","Qureshi"));
				person.setBirthdate(new Date(15));*/
				
				session.save(person);         // Save the contact object in hibernate session
				
				Transaction tx = session.beginTransaction();   // begin the transaction
				tx.commit();
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				
				session.flush();                //flush the hibernate session
				session.close();                //Close the hibernate session
			}

		}

	}

