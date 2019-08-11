package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.model.Airport;



public interface AirportServices {
	
	void insertAirport(Airport airport);
	void editAirport(Airport airport);
	void removeAirport(Airport airport);
	
	Airport findAirportByCityId(int cityId);
	Airport findAirportByCityName(String cityName);
	
	
	
	List<Airport> findAllAipAirports();

}
