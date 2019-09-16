package com.alighthub.BikeRentalSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BikeRateDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bikerate_id;
	private int bikerate_perhour;
	private int bikerate_perday;
	private int bikerate_perweek;
	private int bikerate_deposit;
	
	public int getBikerate_id() {
		return bikerate_id;
	}
	public void setBikerate_id(int bikerate_id) {
		this.bikerate_id = bikerate_id;
	}
	public int getBikerate_perhour() {
		return bikerate_perhour;
	}
	public void setBikerate_perhour(int bikerate_perhour) {
		this.bikerate_perhour = bikerate_perhour;
	}
	public int getBikerate_perday() {
		return bikerate_perday;
	}
	public void setBikerate_perday(int bikerate_perday) {
		this.bikerate_perday = bikerate_perday;
	}
	public int getBikerate_perweek() {
		return bikerate_perweek;
	}
	public void setBikerate_perweek(int bikerate_perweek) {
		this.bikerate_perweek = bikerate_perweek;
	}
	public int getBikerate_deposit() {
		return bikerate_deposit;
	}
	public void setBikerate_deposit(int bikerate_deposit) {
		this.bikerate_deposit = bikerate_deposit;
	}
	
	
	
	
}
