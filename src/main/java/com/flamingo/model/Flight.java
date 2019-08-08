package com.flamingo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue
	private int flightId;
	private String flightName;
	private int capacity;
	private String model;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	public Flight(int flightId, String flightName, int capacity, String model) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.capacity = capacity;
		this.model = model;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
