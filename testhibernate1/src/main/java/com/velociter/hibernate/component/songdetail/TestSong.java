package com.velociter.hibernate.component.songdetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSong {
	public static void main(String[] args) {

		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();

			Song song = new Song();
			
			song.setId(1);
			song.setSongName("Believer");
			song.setSongType("Arena Rock");
			song.setSongDuration("3.30");
			song.getSinger().setSingerName("Imagine Dragons");
			song.getSinger().setSecondSingerName("none");
			song.getSinger().setWriterName("Dan Reynolds");

			session.save(song);
			Transaction tx = session.beginTransaction();
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
//Song song = new Song("Believer", "Arena Rock", "3:24", new Singer("Imaginee Dragons","none", "Dan Reynolds"));