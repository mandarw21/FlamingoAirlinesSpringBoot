package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.Flight;


public interface Flights {

	 void insert(Flight flight);
	 void delete(Flight flight);
	 void update(Flight flight);
	 List<Flight> getAllFlights();
	 Flight getFlightById(int flightId);
}
