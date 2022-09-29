package com.velociter.hibernate.componentmapping.socialmedia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSocialMedia {

	public static void main(String[] args) {
		Session session = null;
		System.out.println("above try");

		try {
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("inside try");
			session = sessionFactory.openSession(); // Open the session

			SocialMedia social = new SocialMedia();
			social.setPassword("100");
			social.setConfirmPassword("100");
			social.getProfile().setFirstName("john");
			social.getProfile().setLastName("smith");
			social.getProfile().setDob("29/11/1998");
			social.getProfile().setEmail("jon@gmail.com");
			social.getProfile().setMobileNumber("098765");
	/*		social.getPost().setLikeCount("1");
			social.getPost().setDislikeCount("1k");
			social.getPost().setPostType("image");
			social.getPost().setCommentCount("50k"); */
			
			if(social.getPassword()==social.getConfirmPassword()) {
				
				session.save(social); // Save the contact object in hibernate session
			}
			
			else {
				System.out.println("password is incorrect");
			}

			

			Transaction tx = session.beginTransaction(); // begin the transaction
			tx.commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			session.flush(); // flush the hibernate session
			session.close(); // Close the hibernate session
		}

	}

}
