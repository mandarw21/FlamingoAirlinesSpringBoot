package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.Airport;
import com.flamingo.model.City;

public interface Airports {

	void addAirport(Airport airport);
	void updateAirport(Airport airport);
	void deleteAirport(Airport airport);
	
	Airport findAirportByCityId(int cityId);
	Airport findAirportByAirportId(int airportId);
	Airport findAirportByAirportName(String airportName);
	Airport findAirportByCityName(String cityName);
	
	List<Airport> listAllAirports();
}
