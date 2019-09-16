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
public class FeedbackDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedback_id;
	private String feedback_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<CustomerDetails> feedback_customer;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeDetails> feedback_employee;

	public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}

	public String getFeedback_name() {
		return feedback_name;
	}

	public void setFeedback_name(String feedback_name) {
		this.feedback_name = feedback_name;
	}

	public List<CustomerDetails> getFeedback_customer() {
		return feedback_customer;
	}

	public void setFeedback_customer(List<CustomerDetails> feedback_customer) {
		this.feedback_customer = feedback_customer;
	}

	public List<EmployeeDetails> getFeedback_employee() {
		return feedback_employee;
	}

	public void setFeedback_employee(List<EmployeeDetails> feedback_employee) {
		this.feedback_employee = feedback_employee;
	} 
	
	
}
