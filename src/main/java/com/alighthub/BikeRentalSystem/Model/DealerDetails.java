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
public class DealerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealer_id;
	private String dealer_name;
	private String dealer_email;
	private long dealer_mobno;
	private long dealer_aadharid;
	
	@Temporal(TemporalType.DATE)
	private Date dealer_registrationdate;
	
	private int dealer_bikescount;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails dealer_address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Images dealer_images;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DocumentDetails> dealer_documents;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LocationDetails dealer_location;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoginDetails dealer_login;

	@OneToMany(cascade = CascadeType.ALL)
	private List<BikeDetails> dealer_bike;
	
	public List<BikeDetails> getDealer_bike() {
		return dealer_bike;
	}

	public void setDealer_bike(List<BikeDetails> dealer_bike) {
		this.dealer_bike = dealer_bike;
	}

	public int getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(int dealer_id) {
		this.dealer_id = dealer_id;
	}

	public String getDealer_name() {
		return dealer_name;
	}

	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}

	public String getDealer_email() {
		return dealer_email;
	}

	public void setDealer_email(String dealer_email) {
		this.dealer_email = dealer_email;
	}

	public long getDealer_mobno() {
		return dealer_mobno;
	}

	public void setDealer_mobno(long dealer_mobno) {
		this.dealer_mobno = dealer_mobno;
	}

	public long getDealer_aadharid() {
		return dealer_aadharid;
	}

	public void setDealer_aadharid(long dealer_aadharid) {
		this.dealer_aadharid = dealer_aadharid;
	}

	public Date getDealer_registrationdate() {
		return dealer_registrationdate;
	}

	public void setDealer_registrationdate(Date dealer_registrationdate) {
		this.dealer_registrationdate = dealer_registrationdate;
	}

	public int getDealer_bikescount() {
		return dealer_bikescount;
	}

	public void setDealer_bikescount(int dealer_bikescount) {
		this.dealer_bikescount = dealer_bikescount;
	}

	public AddressDetails getDealer_address() {
		return dealer_address;
	}

	public void setDealer_address(AddressDetails dealer_address) {
		this.dealer_address = dealer_address;
	}

	public Images getDealer_images() {
		return dealer_images;
	}

	public void setDealer_images(Images dealer_images) {
		this.dealer_images = dealer_images;
	}

	public List<DocumentDetails> getDealer_documents() {
		return dealer_documents;
	}

	public void setDealer_documents(List<DocumentDetails> dealer_documents) {
		this.dealer_documents = dealer_documents;
	}

	public LocationDetails getDealer_location() {
		return dealer_location;
	}

	public void setDealer_location(LocationDetails dealer_location) {
		this.dealer_location = dealer_location;
	}

	public LoginDetails getDealer_login() {
		return dealer_login;
	}

	public void setDealer_login(LoginDetails dealer_login) {
		this.dealer_login = dealer_login;
	}
	
	
}
