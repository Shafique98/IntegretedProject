package com.velociter.hibernate.componentmapping.customer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
	@Column(name="INITIALS")
	char initial;
	@Column(name="FIRST")
	String first;  
	@Column(name="LAST")
	String last;
	
	public Name() {}
	public Name( String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}
	public char getInitial() {
		return initial;
	}
	public void setInitial(char initial) {
		this.initial = initial;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	
}