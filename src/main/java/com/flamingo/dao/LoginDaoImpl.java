package com.flamingo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Override
	public void create(Login login) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(login);
	}

	@Override
	public void update(Login login) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(login);
	}

	@Override
	public void delete(Login login) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(login);
	}

	@Override
	public Login getUserByEmail(Login login) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Login.class, login.getEmail());
	}

	@Override
	public List<Login> listAllUsers() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Login.class);
	}

}
