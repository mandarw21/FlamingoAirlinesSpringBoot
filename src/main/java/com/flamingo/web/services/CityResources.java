package com.flamingo.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flamingo.controller.services.CityServices;
import com.flamingo.model.City;

@RestController
@RequestMapping("/Cities")
public class CityResources {

	@Autowired
	private CityServices cityServices;
	
	@PostMapping
	public String createProduct(@RequestParam("id") int cityId, 
			@RequestParam("name") String cityName,
			@RequestParam("state") String state,
			@RequestParam("country") String country,
			@RequestParam("pin") int pinCode
			) {
		
		City city = new City(cityId,cityName,state,country,pinCode);
		cityServices.insertCity(city);
		
		
		
		return "City "+cityId+ " created successfully";
		
	}
}
