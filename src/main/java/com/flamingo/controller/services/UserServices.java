package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.model.User;


public interface UserServices {
	
	void insertUser(User user);
	void editUser(User user);
	void removeUser(User user);
	
	
	User findUserByEmailId(User user);
	
	
	
	List<User> findAllUsers();
	
}
