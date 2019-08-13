package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.model.Login;



public interface LoginSpec {

	void addLogin(Login Login);
	void updateLogin(Login Login);
	void deleteLogin(Login Login);
	
	Login findByLoginId(int LoginId);

	List<Login> listAllCities();
	
	boolean verify(Login login);
	String encode(Login login);
	
	
	
}
