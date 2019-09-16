package com.alighthub.BikeRentalSystem.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookingDetails 

{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
	private String booking_image;
	private String booking_video;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CustomerDetails booking_customer;

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getBooking_image() {
		return booking_image;
	}

	public void setBooking_image(String booking_image) {
		this.booking_image = booking_image;
	}

	public String getBooking_video() {
		return booking_video;
	}

	public void setBooking_video(String booking_video) {
		this.booking_video = booking_video;
	}

	public CustomerDetails getBooking_customer() {
		return booking_customer;
	}

	public void setBooking_customer(CustomerDetails booking_customer) {
		this.booking_customer = booking_customer;
	}
	
	
}
