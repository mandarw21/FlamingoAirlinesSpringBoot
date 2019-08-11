package com.flamingo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.model.Airport;
import com.flamingo.model.City;


@Repository
public class AirportsImpl implements Airports {

	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public void addAirport(Airport airport) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(airport.getCity());
		hibernateTemplate.save(airport);
	}

	@Override
	public void updateAirport(Airport airport) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(airport);
	}

	@Override
	public void deleteAirport(Airport airport) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(airport);

	}

	@Override
	public Airport findAirportByCityId(int ap_cityId) {
		// TODO Auto-generated method stub
		
			
	return hibernateTemplate.get(Airport.class,ap_cityId);
	
	}

	@Override
	public Airport findAirportByAirportId(int airportId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Airport.class,airportId);	
		
	}

	@Override
	public Airport findAirportByAirportName(String airportName) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Airport.class,airportName);	

	}

	public Airport findAirportByCityName(String cityName) {
		 
		return hibernateTemplate.get(Airport.class,cityName);	
	 }
	 
	 
	@Override
	public List<Airport> listAllAirports() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Airport.class);
	}

}
