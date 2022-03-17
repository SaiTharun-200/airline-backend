package com.rakuten.repository;

import java.util.List;

import com.rakuten.model.Flight;

public interface AdminRepo {

	public List<Flight> findAll();
	public Flight findById(String flightNumber);
	public Flight  addFlight(Flight toBeAdded);
	public void updateFlight(Flight toBeUpdated);
	public void deleteFlight(Flight toBeDeleted);
}
