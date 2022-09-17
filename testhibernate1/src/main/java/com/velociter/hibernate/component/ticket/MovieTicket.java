package com.velociter.hibernate.component.ticket;

public class MovieTicket {
	private int ticketNo;  
	private String movieType;
	private Ticket tckt;
	
	
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
