package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.City;

public interface Cities {

	void addCity(City city);
	void updateCity(City city);
	void deleteCity(City city);
	
	City findCityByCityId(int cityId);
	City findCityByCityName(City city);
	
	List<City> listAllCities();
	
}
