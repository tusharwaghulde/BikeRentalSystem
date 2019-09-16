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
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	private String employee_name;
	private String employee_type;
	private String employee_email;
	private String employee_gender;
	private String employee_image;
	@Temporal(TemporalType.DATE)
	private Date employee_joiningdate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoginDetails employee_login;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails employee_address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DealerDetails> employee_dealer;
	
	public List<DealerDetails> getEmployee_dealer() {
		return employee_dealer;
	}

	public void setEmployee_dealer(List<DealerDetails> employee_dealer) {
		this.employee_dealer = employee_dealer;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_type() {
		return employee_type;
	}

	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public String getEmployee_gender() {
		return employee_gender;
	}

	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}

	public String getEmployee_image() {
		return employee_image;
	}

	public void setEmployee_image(String employee_image) {
		this.employee_image = employee_image;
	}

	public Date getEmployee_joiningdate() {
		return employee_joiningdate;
	}

	public void setEmployee_joiningdate(Date employee_joiningdate) {
		this.employee_joiningdate = employee_joiningdate;
	}

	public LoginDetails getEmployee_login() {
		return employee_login;
	}

	public void setEmployee_login(LoginDetails employee_login) {
		this.employee_login = employee_login;
	}

	public AddressDetails getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(AddressDetails employee_address) {
		this.employee_address = employee_address;
	}

	
	
	
}
