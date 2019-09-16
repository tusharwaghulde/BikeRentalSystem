package com.alighthub.BikeRentalSystem.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int review_id;
	private String review_name;
	private String review_details;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails review_customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BikeDetails review_bike;

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public String getReview_name() {
		return review_name;
	}

	public void setReview_name(String review_name) {
		this.review_name = review_name;
	}

	public String getReview_details() {
		return review_details;
	}

	public void setReview_details(String review_details) {
		this.review_details = review_details;
	}

	public CustomerDetails getReview_customer() {
		return review_customer;
	}

	public void setReview_customer(CustomerDetails review_customer) {
		this.review_customer = review_customer;
	}

	public BikeDetails getReview_bike() {
		return review_bike;
	}

	public void setReview_bike(BikeDetails review_bike) {
		this.review_bike = review_bike;
	}

	
}
