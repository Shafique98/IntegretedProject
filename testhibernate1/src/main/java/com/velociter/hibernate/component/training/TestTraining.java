package com.velociter.hibernate.component.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTraining {

	public static void main(String[] args) {
		Session session = null;
		Transaction tx = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();

			TrainingCenter tc = new TrainingCenter();
			tc.getCourse().setCourseName("Hibernate");
			tc.getCourse().setCourseDuration("1 Month");
			tc.getStudent().setStudentRollNo(45);
			tc.getStudent().setStudentName("Tony");
			session.save(tc);
			tx = session.beginTransaction();
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (session != null) {
				session.flush();
				session.close();
			}

		}
	}
}

//		TrainingCenter tc = new TrainingCenter(new Courses("Java", "3 Month", 3000f), new Student(15, "Johnny"));