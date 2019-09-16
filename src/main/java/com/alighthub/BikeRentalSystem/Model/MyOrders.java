package com.alighthub.BikeRentalSystem.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MyOrders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int myorder_id;
	@OneToOne(cascade = CascadeType.ALL)
	private CartDetails myorder_cart;
	
	public int getMyorder_id() {
		return myorder_id;
	}
	public void setMyorder_id(int myorder_id) {
		this.myorder_id = myorder_id;
	}
	public CartDetails getMyorder_cart() {
		return myorder_cart;
	}
	public void setMyorder_cart(CartDetails myorder_cart) {
		this.myorder_cart = myorder_cart;
	}
	
	
}
