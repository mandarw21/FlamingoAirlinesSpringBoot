package com.flamingo.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flamingo.dao.Users;
import com.flamingo.model.User;


@Service
@Transactional
public class UserServicesImpl implements UserServices {

	
	@Autowired
	private Users userDao;
	
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public void editUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user);
	}

	@Override
	public User findUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return userDao.findUserByUserId(userId);
	}

	@Override
	public User findUserByEmailId(User user) {
		// TODO Auto-generated method stub
		return userDao.findUserByEmailId(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.listAllUsers();
	}

}
