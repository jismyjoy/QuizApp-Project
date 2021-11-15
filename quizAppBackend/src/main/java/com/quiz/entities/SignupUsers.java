package com.quiz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SignupUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String fullname;
	String email;
	String password;
	String mobile;
	
	public SignupUsers() {
		super();
		
	}
	public SignupUsers(String fullname, String email, String password, String mobile) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
