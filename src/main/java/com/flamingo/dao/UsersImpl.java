package com.flamingo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.flamingo.model.User;

@Repository
public class UsersImpl implements Users {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(user);
	}

	@Override
	public User findUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(User.class,userId);
	}

	@Override
	public User findUserByEmailId(User user) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(User.class,user.getEmailId());
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(User.class);
	}

}
