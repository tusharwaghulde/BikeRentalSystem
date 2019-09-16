package com.alighthub.BikeRentalSystem.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ReportDetails 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int report_id;
	private String report_name;
	private String report_type;
	@Temporal(TemporalType.DATE)
	private Date report_startdate;
	@Temporal(TemporalType.DATE)
	private Date report_enddate;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DealerDetails> report_dealers;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<MyOrders> report_myorders;

	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	public String getReport_name() {
		return report_name;
	}

	public void setReport_name(String report_name) {
		this.report_name = report_name;
	}

	public String getReport_type() {
		return report_type;
	}

	public void setReport_type(String report_type) {
		this.report_type = report_type;
	}

	public Date getReport_startdate() {
		return report_startdate;
	}

	public void setReport_startdate(Date report_startdate) {
		this.report_startdate = report_startdate;
	}

	public Date getReport_enddate() {
		return report_enddate;
	}

	public void setReport_enddate(Date report_enddate) {
		this.report_enddate = report_enddate;
	}

	public List<DealerDetails> getReport_dealers() {
		return report_dealers;
	}

	public void setReport_dealers(List<DealerDetails> report_dealers) {
		this.report_dealers = report_dealers;
	}

	public List<MyOrders> getReport_myorders() {
		return report_myorders;
	}

	public void setReport_myorders(List<MyOrders> report_myorders) {
		this.report_myorders = report_myorders;
	}

}
