package com.alighthub.BikeRentalSystem.Model;

/**
 * 
 * @author Parimal
 *@date 09-09-2019
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class LoginDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int login_id;
	private String login_username;
	private String login_password;
	private String login_role;
	private String login_status;
	
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public String getLogin_username() {
		return login_username;
	}
	public void setLogin_username(String login_username) {
		this.login_username = login_username;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	public String getLogin_role() {
		return login_role;
	}
	public void setLogin_role(String login_role) {
		this.login_role = login_role;
	}
	public String getLogin_status() {
		return login_status;
	}
	public void setLogin_status(String login_status) {
		this.login_status = login_status;
	}
	
	
	
}
