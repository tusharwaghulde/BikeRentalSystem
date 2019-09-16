package com.alighthub.BikeRentalSystem.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CartDetails
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cart_id;
	@Temporal(TemporalType.DATE)
	private Date cart_date;
	@Temporal(TemporalType.DATE)
	private Date cart_startdate;
	@Temporal(TemporalType.DATE)
	private Date cart_enddate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails cart_customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BikeRateDetails cart_bikerates;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public Date getCart_date() {
		return cart_date;
	}

	public void setCart_date(Date cart_date) {
		this.cart_date = cart_date;
	}

	public Date getCart_startdate() {
		return cart_startdate;
	}

	public void setCart_startdate(Date cart_startdate) {
		this.cart_startdate = cart_startdate;
	}

	public Date getCart_enddate() {
		return cart_enddate;
	}

	public void setCart_enddate(Date cart_enddate) {
		this.cart_enddate = cart_enddate;
	}

	public CustomerDetails getCart_customer() {
		return cart_customer;
	}

	public void setCart_customer(CustomerDetails cart_customer) {
		this.cart_customer = cart_customer;
	}

	public BikeRateDetails getCart_bikerates() {
		return cart_bikerates;
	}

	public void setCart_bikerates(BikeRateDetails cart_bikerates) {
		this.cart_bikerates = cart_bikerates;
	}
	
	
	
}
