package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.model.Flight;
import com.flamingo.model.FlightSchedule;

public interface FlightScheduleServices {

	 void  insertFlightSchedule(FlightSchedule flightSchedule);
		
	 void  editFlightSchedule(FlightSchedule flightSchedule);
	
	 void  removeFlightSchedule(FlightSchedule flightSchedule);
	
	Flight findFlightScheduleById(FlightSchedule flightSchedule);
	
	List<FlightSchedule> findAllFlightSchedule();


	
}
