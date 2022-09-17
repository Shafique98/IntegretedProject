package com.velociter.hibernate.component.animal;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

import javassist.convert.Transformer;

public class TestAnimal2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = null;
		try {
			
			SessionFactory sf = new Configuration().configure().buildSessionFactory();	//Hibernate.cfg.xml loading
			session = sf.openSession();	//Open the Session
			
//			Query results = session.createQuery("SELECT animalName FROM Animal");
//			Query results = session.createQuery("SELECT animalName,animalBreed FROM Animal");		
//			List<String> animalNames = (List<String>) results.list();
//			System.out.println(animalNames);

//			for(String names : animalNames) {
//				System.out.println(names);
//			}
			
			
			Iterator iter = session.createQuery("SELECT animalName,animalBreed,animalType,legs FROM Animal").list().iterator();
			System.out.println("Animal name \t Animal Breed \t Animal Type \t Animal Legs");
			while(iter.hasNext()) {
				Object[] row = (Object[]) iter.next();
				String names = (String) row[0]; 
				String breed = (String) row[1];
				String type = (String) row[2];
				int legs =(int) row[3];
				System.out.println(names+"\t\t"+breed+"\t\t"+type+"\t\t"+(legs==2?"Two":"Four"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.flush();
				session.close();
			}
		}

	}

}
