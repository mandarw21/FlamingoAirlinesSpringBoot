package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.Login;



public interface LoginDao {

	void create(Login login);
	void update(Login login);
	void delete(Login login);
	
	
	Login getUserByEmail(Login login);
	
	List<Login> listAllUsers();
}
