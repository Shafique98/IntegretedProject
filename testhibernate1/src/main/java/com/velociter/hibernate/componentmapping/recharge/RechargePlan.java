package com.velociter.hibernate.componentmapping.recharge;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RechargePlan {
	@Column(name = "PLAN_NAME")
	private String planName;
	@Column(name = "BALANCE")
	private float  balance;
	@Column(name = "PLAN_VALIDITY")
	private String validity;
	@Column(name = "PLAN_DATA")
	private String data;
	@Column(name = "PLAN_OFFER")
	private String offer;
	
	public RechargePlan() {}

	public RechargePlan(String planName, float balance, String validity, String data, String offer) {
		super();
		this.planName = planName;
		this.balance = balance;
		this.validity = validity;
		this.data = data;
		this.offer = offer;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}
	
	
}
