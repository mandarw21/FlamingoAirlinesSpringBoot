package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.Flight;


public interface Flights {

	public void insert(Flight flight);
	public void delete(Flight flight);
	public void update(Flight flight);
	public List<Flight> getAllFlights();
	public Flight getFlightById(int flightId);
}
