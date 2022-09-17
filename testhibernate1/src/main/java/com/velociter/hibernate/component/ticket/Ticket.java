package com.velociter.hibernate.component.ticket;

public class Ticket {
	private String movieName;
	private String movieTime;
	private String seatType;
	private float  tctCharge;
	
	
	public Ticket () {}


	public Ticket(String movieName, String movieTime, String seatType, float tctCharge) {
		super();
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.seatType = seatType;
		this.tctCharge = tctCharge;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getMovieTime() {
		return movieTime;
	}


	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}


	public String getSeatType() {
		return seatType;
	}


	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}


	public float getTctCharge() {
		return tctCharge;
	}


	public void setTctCharge(float tctCharge) {
		this.tctCharge = tctCharge;
	}


	

	
	
}
