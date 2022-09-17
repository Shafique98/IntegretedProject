package com.velociter.hibernate.componentmapping.recharge;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_RECHARGE")
public class MobileRecharge {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RECHARGE_ID")
	private long rechargeId;

	@Column(name = "MOBILE_NO")
	private String mobileNum;

	@Column(name = "OPERATOR_NAME")
	private String operatorName;
	@Embedded
	private RechargePlan plan = new RechargePlan();

	public MobileRecharge() {
	}
	
	public MobileRecharge(String mobileNum, String operatorName, RechargePlan plan) {
		super();
		this.mobileNum = mobileNum;
		this.operatorName = operatorName;
		this.plan = plan;
	}

	public long getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(long rechargeId) {
		this.rechargeId = rechargeId;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	
	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public RechargePlan getPlan() {
		return plan;
	}

	public void setPlan(RechargePlan plan) {
		this.plan = plan;
	}

}
