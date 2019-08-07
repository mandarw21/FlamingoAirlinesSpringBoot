package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.Airport;
import com.flamingo.model.City;

public interface Airports {

	void addAirport(Airport airport);
	void updateAirport(Airport airport);
	void deleteAirport(Airport airport);
	
	Airport findAirportByCityId(Airport airport);
	Airport findAirportByAirportId(Airport airport);
	Airport findAirportByAirportName(Airport airport);
	
	List<Airport> listAll();
}
