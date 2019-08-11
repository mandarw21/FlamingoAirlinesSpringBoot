package com.flamingo.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flamingo.controller.services.AirportServices;
import com.flamingo.model.Airport;
import com.flamingo.model.City;


@RestController
@RequestMapping("/Airports")
public class AirportResources {

	@Autowired
	private AirportServices airportServices;
	
	
	@PostMapping
	public String createAirport(@RequestParam("id") int airportId, 
			@RequestParam("name") String airportName,
			@RequestParam("cityId") int cityId,
			@RequestParam("cityName") String cityName,
			@RequestParam("state") String state,
			@RequestParam("country") String country,
			@RequestParam("pin") int pincode
			)
	{
		City city = new City();
		city.setCityId(cityId);
		city.setCityName(cityName);
		city.setStateName(state);
		city.setCountryName(country);
		city.setPincode(pincode);
		
		Airport airport = new Airport(airportId,airportName,city);
		airportServices.insertAirport(airport);
		
		return "Airport "+airportId+ " created successfully";
		
		
	}
	
	@GetMapping("/{id}")
	public Airport	 getAirportByCityId(@PathVariable("id") int cityId) {
//		City city = new City();
//		city.setCityId(cityId);
		
		
		return airportServices.findAirportByCityId(cityId);
		
	}
}
