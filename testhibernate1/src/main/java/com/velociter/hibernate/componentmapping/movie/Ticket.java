package com.velociter.hibernate.componentmapping.movie;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Ticket {
	@Column(name = "MOVIE_NAME")
	private String movieName;
	@Column(name = "SCREEN_NO")
	private int screenNo;
	@Column(name = "MOVIE_TIME")
	private String movieTime;
	@Column(name = "SEAT_TYPE")
	private String seatType;
	@Column(name = "SEAT_NO")
	private String seatNum;
	@Column(name = "PRICE")
	private float  price;
	
	
	public Ticket () {}
	
	

	public Ticket(String movieName, int screenNo, String movieTime, String seatType, String seatNum) {
		super();
		this.movieName = movieName;
		this.screenNo = screenNo;
		this.movieTime = movieTime;
		this.seatType = seatType;
		this.seatNum = seatNum;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getScreenNo() {
		return screenNo;
	}

	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
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
	
	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
}
