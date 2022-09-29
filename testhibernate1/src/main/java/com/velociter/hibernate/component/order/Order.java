package com.velociter.hibernate.component.order;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long orderId;
	@Column(name="TOTALS",nullable = false)
	private long totals;
	@Embedded
	private Item item = new Item();
	@Embedded
	private Customer customer = new Customer();;
	
	public Order() {}	
	
	public Order(long totals, Item item, Customer customer) {
		super();
		this.totals = totals;
		this.item = item;
		this.customer = customer;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getTotals() {
		return totals;
	}

	public void setTotals(long totals) {
		this.totals = totals;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
