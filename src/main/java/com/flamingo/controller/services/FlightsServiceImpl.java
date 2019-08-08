package com.flamingo.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flamingo.dao.Flights;
import com.flamingo.model.Flight;

@Service
@Transactional
public class FlightsServiceImpl implements FlightsServices {

	@Autowired
	private Flights flightDao;
	
	@Override
	public void insertFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightDao.insert(flight);
		
	}

	@Override
	public void editFlight(Flight flight) {
		// TODO Auto-generated method stub

		Flight dbFlight=findFlightById(flight.getFlightId());
		if(dbFlight!=null)
		{
			dbFlight.setFlightName(flight.getFlightName());
			dbFlight.setCapacity(flight.getCapacity());
			dbFlight.setModel(flight.getModel());
			flightDao.update(dbFlight);
		}
		else
			System.out.println("Sorry can't find this Flight");
		}

	@Override
	public void removeFlight(Flight flight) {
		// TODO Auto-generated method stub
		Flight dbFlight=findFlightById(flight.getFlightId());
		if(dbFlight!=null)
		flightDao.delete(flight);
		else 
			System.out.println("Sorry can't find this Flight");
	}

	@Override
	public Flight findFlightById(int flightId) {
		// TODO Auto-generated method stub
			return flightDao.getFlightById(flightId);
	}

	@Override
	public List<Flight> findAllFlights() {
		// TODO Auto-generated method stub
		return flightDao.getAllFlights();
	}

	@Override
	public int getFlightCount() {
		// TODO Auto-generated method stub
		return flightDao.getAllFlights().size();
	}

}
