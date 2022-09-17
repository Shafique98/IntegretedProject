package com.velociter.hibernate.componentmapping.movie;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIETICKET")
public class MovieTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TICKET_NO")
	private int ticketNo;
	@Column(name = "MOVIE_TYPE")
	private String movieType;
	@Embedded
	private Ticket tckt = new Ticket();
	
	
	public MovieTicket() {}


	public MovieTicket(String movieType, Ticket tckt) {
		super();
	
		this.movieType = movieType;
		this.tckt = tckt;
	}


	public int getTicketNo() {
		return ticketNo;
	}


	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}


	public String getMovieType() {
		return movieType;
	}


	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}


	public Ticket getTckt() {
		return tckt;
	}


	public void setTckt(Ticket tckt) {
		this.tckt = tckt;
	}

	
}
