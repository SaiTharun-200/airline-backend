package com.rakuten.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.rakuten.model.Flight;
import com.rakuten.repository.AdminRepo;

public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepo adminRepo;
	
	@Override
	public String addNewFlight(Flight toBeAdded) {
		
		Flight saved = adminRepo.addFlight(toBeAdded);

		return saved.getFlightNumber();
	}


	@Override
	public int deleteById(String flightNumber) {
		
		Flight toBeDeleted = adminRepo.findById(flightNumber);
		if(toBeDeleted==null)
			return 0;
		
		adminRepo.deleteFlight(toBeDeleted);
		return 1;
	}

}
