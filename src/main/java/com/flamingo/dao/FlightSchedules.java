package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.Flight;
import com.flamingo.model.FlightSchedule;

public interface FlightSchedules {

	
	void addSchedule(FlightSchedule flightSchedules);
	 void deleteSchedule (FlightSchedule flightSchedules);
	 void updateSchedule (FlightSchedule flightSchedules);
	 List<FlightSchedule> getAllFlightschedule();
	 FlightSchedule getFlightscheduleById(int flightId);
}

