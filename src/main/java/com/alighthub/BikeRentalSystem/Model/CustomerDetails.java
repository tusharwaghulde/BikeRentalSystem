package com.alighthub.BikeRentalSystem.Model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	private String customer_name;
	private String customer_email;
	private long customer_aadharid;
	private String customer_license_no;
	private int customer_walletbalance;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails customer_address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Images customer_images;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DocumentDetails> customer_documents;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoginDetails customer_login;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public long getCustomer_aadharid() {
		return customer_aadharid;
	}

	public void setCustomer_aadharid(long customer_aadharid) {
		this.customer_aadharid = customer_aadharid;
	}

	public String getCustomer_license_no() {
		return customer_license_no;
	}

	public void setCustomer_license_no(String customer_license_no) {
		this.customer_license_no = customer_license_no;
	}

	public int getCustomer_walletbalance() {
		return customer_walletbalance;
	}

	public void setCustomer_walletbalance(int customer_walletbalance) {
		this.customer_walletbalance = customer_walletbalance;
	}

	public AddressDetails getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(AddressDetails customer_address) {
		this.customer_address = customer_address;
	}

	public Images getCustomer_images() {
		return customer_images;
	}

	public void setCustomer_images(Images customer_images) {
		this.customer_images = customer_images;
	}

	public List<DocumentDetails> getCustomer_documents() {
		return customer_documents;
	}

	public void setCustomer_documents(List<DocumentDetails> customer_documents) {
		this.customer_documents = customer_documents;
	}

	public LoginDetails getCustomer_login() {
		return customer_login;
	}

	public void setCustomer_login(LoginDetails customer_login) {
		this.customer_login = customer_login;
	}
	
		
}
