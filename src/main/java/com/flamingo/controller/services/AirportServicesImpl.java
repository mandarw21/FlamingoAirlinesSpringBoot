package com.flamingo.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flamingo.model.Airport;
import com.flamingo.dao.Airports;


@Service
@Transactional
public class AirportServicesImpl implements AirportServices {

	
	@Autowired
	private Airports airportDao;
	
	@Override
	public void insertAirport(Airport airport) {
		// TODO Auto-generated method stub
		airportDao.addAirport(airport);
	}

	@Override
	public void editAirport(Airport airport) {
		// TODO Auto-generated method stub
		airportDao.updateAirport(airport);
	}

	@Override
	public void removeAirport(Airport airport) {
		// TODO Auto-generated method stub
		airportDao.deleteAirport(airport);
	}

	@Override
	public Airport findAirportByCityId(int cityId) {
		// TODO Auto-generated method stub
		return airportDao.findAirportByCityId(cityId);
	}

	@Override
	public Airport findAirportByCityName(String cityName) {
		// TODO Auto-generated method stub
		return airportDao.findAirportByCityName(cityName);

	}

	@Override
	public List<Airport> findAllAipAirports() {
		// TODO Auto-generated method stub
		return airportDao.listAllAirports();
	}

}
