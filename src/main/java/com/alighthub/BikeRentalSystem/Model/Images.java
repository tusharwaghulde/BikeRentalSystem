package com.alighthub.BikeRentalSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Images {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int image_id;
	private String image_String;
	
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public String getImage_String() {
		return image_String;
	}
	public void setImage_String(String image_String) {
		this.image_String = image_String;
	}
	
	
}
