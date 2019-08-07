package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.model.Flight;

public interface FlightsServices {
	 void  insertFlight(Flight flight);
	
	 void  editFlight(Flight flight);
	
	 void  removeFlight(Flight flight);
	
	Flight findFlightById(int flightId);
	
	List<Flight> findAllFlights();

	int  getFlightCount();
	

}
