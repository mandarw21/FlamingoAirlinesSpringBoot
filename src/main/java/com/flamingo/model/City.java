package com.flamingo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "cities")
public class City {

	@Id
	//@GeneratedValue
	@Column(name="cityId")
	private int cityId;
	
	@Column(name="cityName")
	@NotNull
	private String cityName;
	
	@Column(name="stateName")
	@NotNull
	private String stateName;
	
	@Column(name="countryName")
	@NotNull
	private String countryName;
	
	@Column(name="pincode")
	@NotNull
	private int pincode;
	
	
	public City() {
		super();
	}


	public City(int cityId, String cityName, String stateName, String countryName,int pincode) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.pincode = pincode;
	}


	public int getCityId() {
		return cityId;
	}


	public void setCityId(int cityId) {
		this.cityId = cityId;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
}
