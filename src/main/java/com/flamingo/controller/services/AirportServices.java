package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.model.Airport;
import com.flamingo.model.City;



public interface AirportServices {
	
	void insertAirport(Airport airport);
	void editAirport(Airport airport);
	void removeAirport(Airport airport);
	
	Airport findAirportByCityId(int cityId);
	Airport findAirportByCityName(String cityName);
	
	Airport findAirportByCity(City city);
	
	Airport findAirportByAirportName(String airportName);
	
	List<Airport> findAllAipAirports();

}
