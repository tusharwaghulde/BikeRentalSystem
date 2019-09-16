package com.alighthub.BikeRentalSystem.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Queries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int query_id;
	private String query_name;
	private String  query_details;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails query_customer;

	public int getQuery_id() {
		return query_id;
	}

	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}

	public String getQuery_name() {
		return query_name;
	}

	public void setQuery_name(String query_name) {
		this.query_name = query_name;
	}

	public String getQuery_details() {
		return query_details;
	}

	public void setQuery_details(String query_details) {
		this.query_details = query_details;
	}

	public CustomerDetails getQuery_customer() {
		return query_customer;
	}

	public void setQuery_customer(CustomerDetails query_customer) {
		this.query_customer = query_customer;
	}
	
	
	
}
