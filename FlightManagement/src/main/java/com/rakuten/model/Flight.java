package com.rakuten.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight implements Serializable{
	
	@Id
	private String flightNumber;
	
	private String fromCity;
	
	private String toCity;
	
	private String departureTime;
	
	private String arrivalTime;
	
	private String duration;

	/**
	 * @param flightNumber
	 * @param fromCity
	 * @param toCity
	 * @param departureTime
	 * @param arrivalTime
	 * @param duration
	 */
	public Flight(String flightNumber, String fromCity, String toCity, String departureTime, String arrivalTime,
			String duration) {
		this.flightNumber = flightNumber;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", fromCity=" + fromCity + ", toCity=" + toCity
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", duration=" + duration + "]";
	}
	
	
	
	
	

}
