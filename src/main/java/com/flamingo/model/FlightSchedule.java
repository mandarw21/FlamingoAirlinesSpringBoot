package com.flamingo.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Id;

public class FlightSchedule {
	@Id
	@Column(name = "flightno")
	private String flightno;
	private int origin;
	private int destination;
	
	private Time arrivalTime;
	private Time deparTime;
	private String aircraft;
	private int stops;
	
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	public int getDestination() {
		return destination;
	}
	
	
	public FlightSchedule() {
		super();
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	public String getFlightno() {
		return flightno;
	}
	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}
	public Time getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Time getDeparTime() {
		return deparTime;
	}
	public void setDeparTime(Time deparTime) {
		this.deparTime = deparTime;
	}
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
	public int getStops() {
		return stops;
	}
	public void setStops(int stops) {
		this.stops = stops;
	}
	
	public FlightSchedule(int origin, int destination, String flightno, Time arrivalTime, Time deparTime,
			String aircraft, int stops) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.flightno = flightno;
		this.arrivalTime = arrivalTime;
		this.deparTime = deparTime;
		this.aircraft = aircraft;
		this.stops = stops;

	}}
