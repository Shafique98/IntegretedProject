package com.velociter.hibernate.component.order;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Item {
	@Column(name= "ITEM_ID",nullable = false)
	private long itemId;
	@Column(name= "ITEM_NAME",nullable = false)
	private String itemName;
	@Column(name= "ITEM_TYPE",nullable = false)
	private String itemType;
	@Column(name= "ITEM_PRICE",nullable = false)
	private float itemPrice;
	@Column(name= "ITEM_QTY",nullable = false)
	private int itemQuantity;

	public Item() {
	}
	
	public Item(String itemName, String itemType, float itemPrice, int itemQuantity) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
}
