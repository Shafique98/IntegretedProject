package com.velociter.hibernate.component.animal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Domestic {
	@Column(name = "BENIFITS",nullable = false)
	private String purposeOfCapturing;

	public Domestic() {
	}

	public Domestic(String purposeOfCapturing) {
		super();
		this.purposeOfCapturing = purposeOfCapturing;
	}

	public String getPurposeOfCapturing() {
		return purposeOfCapturing;
	}

	public void setPurposeOfCapturing(String purposeOfCapturing) {
		this.purposeOfCapturing = purposeOfCapturing;
	}

}
