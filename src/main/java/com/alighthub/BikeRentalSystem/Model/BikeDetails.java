package com.alighthub.BikeRentalSystem.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BikeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bike_id;
	private String bike_name;
	private String bike_brand;
	private String bike_model;
	private int bike_insuranceNo;
	private int bike_manufactureYear;
	@Temporal(TemporalType.DATE)
	private Date bike_insuranceExpDate;
	private int bike_engcc;
	private String bike_number;

	@ManyToOne(cascade = CascadeType.ALL)
	private LocationDetails bike_location;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeeDetails bike_employee;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Images> bike_images;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DocumentDetails> bike_documents;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BikeRateDetails bike_rate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private DealerDetails bike_dealers;

	public int getBike_id() {
		return bike_id;
	}

	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}

	public String getBike_name() {
		return bike_name;
	}

	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}

	public String getBike_brand() {
		return bike_brand;
	}

	public void setBike_brand(String bike_brand) {
		this.bike_brand = bike_brand;
	}

	public String getBike_model() {
		return bike_model;
	}

	public void setBike_model(String bike_model) {
		this.bike_model = bike_model;
	}

	public int getBike_insuranceNo() {
		return bike_insuranceNo;
	}

	public void setBike_insuranceNo(int bike_insuranceNo) {
		this.bike_insuranceNo = bike_insuranceNo;
	}

	public int getBike_manufactureYear() {
		return bike_manufactureYear;
	}

	public void setBike_manufactureYear(int bike_manufactureYear) {
		this.bike_manufactureYear = bike_manufactureYear;
	}

	public Date getBike_insuranceExpDate() {
		return bike_insuranceExpDate;
	}

	public void setBike_insuranceExpDate(Date bike_insuranceExpDate) {
		this.bike_insuranceExpDate = bike_insuranceExpDate;
	}

	public int getBike_engcc() {
		return bike_engcc;
	}

	public void setBike_engcc(int bike_engcc) {
		this.bike_engcc = bike_engcc;
	}

	public String getBike_number() {
		return bike_number;
	}

	public void setBike_number(String bike_number) {
		this.bike_number = bike_number;
	}

	public LocationDetails getBike_location() {
		return bike_location;
	}

	public void setBike_location(LocationDetails bike_location) {
		this.bike_location = bike_location;
	}

	public EmployeeDetails getBike_employee() {
		return bike_employee;
	}

	public void setBike_employee(EmployeeDetails bike_employee) {
		this.bike_employee = bike_employee;
	}

	public List<Images> getBike_images() {
		return bike_images;
	}

	public void setBike_images(List<Images> bike_images) {
		this.bike_images = bike_images;
	}

	public List<DocumentDetails> getBike_documents() {
		return bike_documents;
	}

	public void setBike_documents(List<DocumentDetails> bike_documents) {
		this.bike_documents = bike_documents;
	}

	public BikeRateDetails getBike_rate() {
		return bike_rate;
	}

	public void setBike_rate(BikeRateDetails bike_rate) {
		this.bike_rate = bike_rate;
	}

	public DealerDetails getBike_dealers() {
		return bike_dealers;
	}

	public void setBike_dealers(DealerDetails bike_dealers) {
		this.bike_dealers = bike_dealers;
	}
	
	
}
