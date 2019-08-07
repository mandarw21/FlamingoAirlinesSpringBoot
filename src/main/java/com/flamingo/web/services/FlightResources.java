package com.flamingo.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flamingo.controller.services.FlightsServices;
import com.flamingo.model.Flight;

@RestController
@RequestMapping("/flights")
public class FlightResources {

	@Autowired
	private FlightsServices services;
	
	@GetMapping("/getAllFlights")
		public List<Flight> getAllflights(){
		return services.findAllFlights();
	}
	
	@GetMapping("/createFlight")
	public String createFlight(@RequestParam int flightId,@RequestParam String flightName,@RequestParam int capacity,@RequestParam String model)
	{
		Flight flight=new Flight(flightId, flightName, capacity, model);
		if(flight!=null)
			return "flight with flight id"+flightId+"is created successfully";
		
		return "flight is not created";
	}
	
	
	
	
}
