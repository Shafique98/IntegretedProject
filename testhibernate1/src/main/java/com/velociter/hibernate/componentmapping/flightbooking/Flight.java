package com.velociter.hibernate.componentmapping.flightbooking;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLIGHT")
public class Flight {
 /*   @Column(name="PASSENGER_NAME")
	private String passengerName;*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	@Embedded
	private Ticket ticket=new Ticket(); 

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}  

	public Flight() {
	}

/*	public Flight(String passengerName, int flightId) {
		super();
		this.passengerName = passengerName;
		this.flightId = flightId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}*/

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}


}