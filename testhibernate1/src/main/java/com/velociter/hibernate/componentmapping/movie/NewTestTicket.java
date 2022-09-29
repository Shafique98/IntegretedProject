package com.velociter.hibernate.componentmapping.movie;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewTestTicket {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();

			Query query = session.createQuery("from MovieTicket");
			List<MovieTicket> list = query.list();
			
			System.out.println("MovieType \t MovieName\t ScreenNo \t MovieTime \t SeatType \t SeatNum \t  Price");
			
			for (MovieTicket movie : list) {
				System.out.println(movie.getMovieType()+"\t"+movie.getTckt().getMovieName()+"\t"
			+movie.getTckt().getScreenNo()+"\t"+movie.getTckt().getMovieTime()+"\t"+movie.getTckt().getSeatType()+"\t"
				+movie.getTckt().getSeatNum()+"\t"+movie.getTckt().getPrice());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}