
package com.flamingo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.micrometer.core.lang.NonNull;

@Entity
@Table(name = "airport")
public class Airport {

	
	@Id
	@GeneratedValue
	@Column(name = "airportId")
	private int airportId;
	
	@Column(name = "airportName",nullable = false)
	@NonNull
	private String airportName;
	
	@OneToOne(targetEntity = City.class)
	@JoinColumn(name="ap_cityId", referencedColumnName = "cityId",nullable = false)
	private City city;
	
	
	
	
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
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
	
	
	
	
}
