package com.flamingo.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String createCity(@RequestParam("id") int cityId, 
			@RequestParam("name") String cityName,
			@RequestParam("state") String state,
			@RequestParam("country") String country,
			@RequestParam("pin") int pinCode
			) {
		
		City city = new City(cityId,cityName,state,country,pinCode);
		cityServices.insertCity(city);
		
		
		
		return "City "+cityId+ " created successfully";
		
	}
	
	@GetMapping("/{id}")
	public City	 getCityById(@PathVariable("id") int cityId) {
		return cityServices.findCityByCityId(cityId);
		
	}
	
	@GetMapping("/{name}")
	public City	 getCityByName(@PathVariable("name") String cityName) {
		
		City city = new City();
		city.setCityName(cityName);
		return cityServices.findCityByCityName(city);
		
	}
	
	@GetMapping
	public List<City> getAllProducts() {
		
		return cityServices.findAllCities();
	}

	@PutMapping
	public String editCity(@RequestBody City city) {
		
		cityServices.edit(city);
		return "City "+ city.getCityId()+ " edited successfuly";
		
	}
	
	@DeleteMapping
	public String removeCity(@RequestBody City city) {
		cityServices.remove(city);
		return "City "+ city.getCityId()+ " removed successfully";
	}
	
	@GetMapping("/count")
	public int  getCityCount() {
		
		return cityServices.findAllCities().size();
		
	}

	
}
