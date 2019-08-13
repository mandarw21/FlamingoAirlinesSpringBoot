package com.flamingo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import io.micrometer.core.lang.NonNull;

@Component
@Entity
@Table(name = "login")
public class Login {

	@Id
	private String email;
	@NotNull
	private String passwd;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	public Login(String email, String passwd) {
		super();
		this.email = email;
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
	
}
