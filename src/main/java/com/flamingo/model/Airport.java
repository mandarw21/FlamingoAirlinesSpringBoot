package com.flamingo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {

	
	@Id
	@GeneratedValue
	@Column(name = "airportId")
	private int airportId;
	
	@Column(name = "airportName",nullable = false)
	private String airportName;
	
	@OneToMany(targetEntity = City.class)
	@JoinColumn(name="cityId", referencedColumnName = "cityId",nullable = false)
	private int cityId;
	
	
	
	
	public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	
	
	
	
	
}
