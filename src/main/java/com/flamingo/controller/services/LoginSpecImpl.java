package com.flamingo.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.flamingo.dao.LoginDao;
import com.flamingo.model.Login;

public class LoginSpecImpl implements LoginSpec {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void addLogin(Login Login) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void updateLogin(Login Login) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLogin(Login Login) {
		// TODO Auto-generated method stub

	}

	@Override
	public Login findByLoginId(int LoginId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Login> listAllCities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verify(Login login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String encode(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
