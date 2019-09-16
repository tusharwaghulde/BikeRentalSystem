package com.alighthub.BikeRentalSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DocumentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int document_id;
	private String document_filename;
	private String document_filetype;
	private String document_documentpath;
	
	public int getDocument_id() {
		return document_id;
	}
	public void setDocument_id(int document_id) {
		this.document_id = document_id;
	}
	public String getDocument_filename() {
		return document_filename;
	}
	public void setDocument_filename(String document_filename) {
		this.document_filename = document_filename;
	}
	public String getDocument_filetype() {
		return document_filetype;
	}
	public void setDocument_filetype(String document_filetype) {
		this.document_filetype = document_filetype;
	}
	public String getDocument_documentpath() {
		return document_documentpath;
	}
	public void setDocument_documentpath(String document_documentpath) {
		this.document_documentpath = document_documentpath;
	}
	
	
}
