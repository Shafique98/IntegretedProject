package com.velociter.hibernate.componentmapping.flightbooking;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Ticket {
	/*@Column(name="FLIGHT")
	private String flight;
	@Column(name="BORDING_TIME")
	private String bordingTime;
	@Column(name="DURATION")
	private String duration;
	@Column(name="GATE_NUMBER")
	private int    gateNumber;
	@Column(name="SEAT_NUMBER")
	private String seatNumber;
	@Column(name="CLASS_TYPE")
	private String classType;
	@Column(name="TICKET_NUMBER")
	private String ticketNumber;
	@Column(name="COMPANY")
	private String company;*/
	
	@Column(name="DATES")
	private String date;
	@Column(name="CURRENT_LOCATION")
	private String currentLocation;
	@Column(name="DESTINATION")
	private String destination;
	
	public Ticket () {}


/*	public Ticket(String flight, String duration, String currentLocation, String destination, String company) {
		super();
		this.flight = flight;
		this.duration = duration;
		this.currentLocation = currentLocation;
		this.destination = destination;
		this.company = company;
	}
*/

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

/*
	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getBordingTime() {
		return bordingTime;
	}

	public void setBordingTime(String bordingTime) {
		this.bordingTime = bordingTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}*/

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

/*

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}

	*/

}
