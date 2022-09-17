package com.velociter.hibernate.componentmapping.flightbooking;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestFlight {
	public static void main(String[] args) {

		Session session = null;
		System.out.println("outside try");

		try {
			System.out.println("inside try");
			SessionFactory sessionFectory = new Configuration().configure().buildSessionFactory();
			System.out.println("under sessonFactory");
			session = sessionFectory.openSession();

			Flight flight = new Flight();
//			flight.setPassengerName("Dev Singh");
	/*		flight.getTicket().setBordingTime("10:30AM");
			flight.getTicket().setClassType("ECONOMY");*/
			flight.getTicket().setCurrentLocation("INDORE");
			flight.getTicket().setDestination("PUNE");
			flight.getTicket().setDate("123");
		/*	flight.getTicket().setDuration("2hrs");
			flight.getTicket().setFlight("ABC121");
			flight.getTicket().setGateNumber(10);
			flight.getTicket().setSeatNumber("A101");
			flight.getTicket().setTicketNumber("12345");
			flight.getTicket().setCompany("kingfisher");
			flight.setFlightId(123);*/
			
			session.save(flight);

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
