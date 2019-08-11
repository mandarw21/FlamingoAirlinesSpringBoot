package com.flamingo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.model.FlightSchedule;

@Repository
public class FlightScheduleImpl implements FlightSchedules {
	
	@Autowired
	private HibernateTemplate HibernateTemplate;
	
	@Override
	public void addSchedule(FlightSchedule flightSchedule) {
		// TODO Auto-generated method stub
		HibernateTemplate.save(flightSchedule);
		
	}

	@Override
	public void deleteSchedule(FlightSchedule flightSchedule) {
		// TODO Auto-generated method stub
		HibernateTemplate.delete(flightSchedule);
	}

	@Override
	public void updateSchedule(FlightSchedule flightSchedule) {
		// TODO Auto-generated method stub
		HibernateTemplate.update(flightSchedule);
	}

	@Override
	public List<FlightSchedule> getAllFlightschedule() {
		// TODO Auto-generated method stub
		return HibernateTemplate.loadAll(FlightSchedule.class);
		
	}

	@Override
	public FlightSchedule getFlightscheduleById(int flightId) {
		// TODO Auto-generated method stub
		return HibernateTemplate.get(FlightSchedule.class, flightId);
	}

}
