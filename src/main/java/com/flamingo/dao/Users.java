package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.User;



public interface Users {
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	
	
	User findUserByEmailId(User user);
	
	List<User> listAllUsers();

}
