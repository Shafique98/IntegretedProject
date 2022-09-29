package com.velociter.hibernate.componentmapping.onlinemarriage;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMarriageRegistration2 {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();

			Query query = session.createQuery("from MarriageRegistration");
			List<MarriageRegistration> mrObj = query.list();

			System.out.println("\t FirstName \t LastName \t Gender \t MobileNo \t City");

			for (MarriageRegistration mr : mrObj) {
				System.out.println("         "+mr.getFirstName() +"         "+ mr.getLastName() + "              " + mr.getGender() + "             "
						+ mr.getMobileNo() + "             " + mr.getAddress().getCity());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
