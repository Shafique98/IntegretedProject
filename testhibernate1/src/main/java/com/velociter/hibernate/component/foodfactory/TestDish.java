package com.velociter.hibernate.component.foodfactory;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class TestDish {

	public static void main(String[] args) {
		Session session = null;
		Transaction tx = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			FoodFactory ff = new FoodFactory();

			ff.getDish().setDishName("Laddu");
			ff.getDish().setDishType("Sweet");

			ff.getPrice().setDishPrice(451f);
			ff.getPrice().setGst(44);
			ff.getPrice().setDishDiscount(15);
			ff.getPrice().setTotal(550);

			session.save(ff);

			tx = session.beginTransaction();
			tx.commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.flush();
				session.close();
			}
		}

	}

}
//			FoodFactory ff = new FoodFactory(new Dish(2, "Danish", "Sweet Dish"), new Price(145f, 28f, 10f, 130f));
