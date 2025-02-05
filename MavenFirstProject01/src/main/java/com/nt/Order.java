package com.nt;

import java.util.Date;

public class Order {
	private String prodectId;
	private String prodectName;
	private Date orderDate;
	private Customer customer;

	public String getProdectId() {
		return prodectId;
	}

	public void setProdectId(String prodectId) {
		this.prodectId = prodectId;
	}

	public String getProdectName() {
		return prodectName;
	}

	public void setProdectName(String prodectName) {
		this.prodectName = prodectName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
