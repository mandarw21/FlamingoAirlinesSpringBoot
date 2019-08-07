package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.model.City;

public interface CityServices {

	void insertCity(City city);
	void edit(City city);
	void remove(City city);
	
	City findCityByCityId(int cityId);
	City findCityByCityName();
	
	int getCityCount();
	
	List<City> findAllCities();
	
	
}
