package com.velociter.hibernate.componentmapping.recharge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestRecharge { 

	public static void main(String[] args) {
		Session session = null;

		try {
			System.out.println("Start");
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			System.out.println("Inserting Records");
			session = sessionfactory.openSession();

			MobileRecharge recharge = new MobileRecharge();
			recharge.setMobileNum("9834567843");
			recharge.setOperatorName("Airtel");
			recharge.getPlan().setPlanName("TalkTime");
			recharge.getPlan().setBalance(499);
			recharge.getPlan().setValidity("56 Days");
			recharge.getPlan().setData("1.5GB perDay");
			recharge.getPlan().setOffer("HotStar subscription");
			session.save(recharge);
			Transaction tx = session.beginTransaction();
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {

			session.flush();
			session.close();
		}

	}

}
