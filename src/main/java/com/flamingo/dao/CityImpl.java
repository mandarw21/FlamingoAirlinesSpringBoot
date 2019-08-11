package com.flamingo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.model.City;

@Repository
public class CityImpl implements Cities {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void addCity(City city) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(city);
	}

	@Override
	public void updateCity(City city) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(city);
	}

	@Override
	public void deleteCity(City city) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(city);
	}

	@Override
	public City findCityByCityId(int cityId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(City.class,cityId);
	}

	@Override
	public City findCityByCityName(City city) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(City.class,city.getCityName());
	}

	@Override
	public List<City> listAllCities() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(City.class);
	}


}
