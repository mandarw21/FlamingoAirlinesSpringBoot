package com.flamingo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.flamingo.model.Flight;
/*
 * Author:Hrtithik Jain
 * Creation: 04th august 3.30pm
 * Modify: 04th august 3.30pm
 * version:1.0
 * Copyright:All rights are reserved for Zensar Technologies
 * Description: Implementing the Flights interface to interact with database
 * 				 
 * 
 * 
 * 
 * */


public class FlightsImpl implements Flights {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public void insert(Flight flight) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(flight);
		
	}

	@Override
	public void delete(Flight flight) {
		// TODO Auto-generated method stub

		hibernateTemplate.delete(flight);
		
	}

	@Override
	public void update(Flight flight) {
		// TODO Auto-generated method stub

		hibernateTemplate.update(flight);
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Flight.class);
	}

	@Override
	public Flight getFlightById(int flightId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Flight.class, flightId);	
	}

}
