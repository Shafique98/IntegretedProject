package com.velociter.hibernate.componentmapping.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudent {

	public static void main(String[] args) {
		Session session = null;

		try {
			System.out.println("Start");
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();

			System.out.println("Inserting Records");
			session = sessionfactory.openSession();
			
			Student student=new Student();
			student.getInfo().setFirstName("Shweta");
			student.getInfo().setLastName("Mishra");
			student.getInfo().setFatherName("Father");
			student.getInfo().setMotherName("Mother");
			student.getInfo().setEmail("shweta123@gmail.com");
			student.getInfo().setContact("8763487658");
			student.getAddress().setHouseNo("Ab/48");
			student.getAddress().setStreet("Vijaynagar");
			student.getAddress().setCity("Indore");
			student.getAddress().setPincode(4530001);
			student.getAddress().setState("M.P");
			student.getEducation().setField("Graduation");
			student.getEducation().setInstitueName("MediCaps University");
			student.getEducation().setBoardOrUniversity("MediCaps University");
			student.getEducation().setGrade("A");
			
			session.save(student);

			Transaction tx = session.beginTransaction();
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {

			session.flush();
			session.close();
		}

	}
}
