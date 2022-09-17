package com.velociter.hibernate.component.order;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.velociter.hibernate.component.animal.Animal;

public class TestOrder2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();

			Query query = session.createQuery("select CAT.ANIMAL_NAME from ANIMAL CAT");
			List<Animal> animalList = query.list();
//			System.out.println(Animal animal : animalList);
			
//			Order order = new Order();
//			Iterator i = 
//			System.out.println(order.getItem().getItemName());
			
//			System.out.println("Id \t ItemName \t ItemType \t ItemPrice \t ItemQTY \t CustomerName");
//			for (Order o : orderList) {
//				System.out.println(o.getOrderId() + "\t" + o.getItem().getItemName() + "\t" + o.getItem().getItemType()
//						+ "\t" + o.getItem().getItemPrice() + "\t" + "\t" + o.getItem().getItemQuantity() + "\t"
//						+ o.getCustomer().getCustomerName());
//				System.out.println(o.getItem().getItemName());
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
