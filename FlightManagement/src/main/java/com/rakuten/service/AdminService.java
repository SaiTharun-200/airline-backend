package com.rakuten.service;

import java.util.List;

import com.rakuten.model.Flight;


public interface AdminService {
	public String addNewFlight(Flight toBeAdded);	
//	public List<Flight> getAll();	
//	public Flight getById(int id);
	public int deleteById(String flightNumber);
//	public int updateFlight(Flight toBeUpdated, int id );
	
}
