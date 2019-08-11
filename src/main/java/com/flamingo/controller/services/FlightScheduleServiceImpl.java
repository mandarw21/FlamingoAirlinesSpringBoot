package com.flamingo.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flamingo.dao.Airports;
import com.flamingo.dao.FlightSchedules;
import com.flamingo.model.Flight;
import com.flamingo.model.FlightSchedule;


@Service
@Transactional
public class FlightScheduleServiceImpl implements FlightScheduleServices {
	
	@Autowired
	private FlightSchedules flightScheduleDao;

	@Override
	public void insertFlightSchedule(FlightSchedule flightSchedule) {
		// TODO Auto-generated method stub
		flightScheduleDao.addSchedule(flightSchedule);
	}

	@Override
	public void editFlightSchedule(FlightSchedule flightSchedule) {
		// TODO Auto-generated method stub
		flightScheduleDao.updateSchedule(flightSchedule);
	}

	@Override
	public void removeFlightSchedule(FlightSchedule flightSchedule) {
		// TODO Auto-generated method stub
		flightScheduleDao.deleteSchedule(flightSchedule);
	}

	@Override
	public Flight findFlightScheduleById(FlightSchedule flightSchedule) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public List<FlightSchedule> findAllFlightSchedule() {
		// TODO Auto-generated method stub
		return flightScheduleDao.getAllFlightschedule();
	}

}
