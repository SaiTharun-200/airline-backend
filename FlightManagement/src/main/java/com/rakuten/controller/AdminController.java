package com.rakuten.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.model.Flight;
import com.rakuten.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@PostMapping("/flights")
	public ResponseEntity addNewStudent(@RequestBody Flight toBeAdded) {
	     try {
	    	 String flightNumber = service.addNewFlight(toBeAdded);
	    	 HttpHeaders headers = new HttpHeaders();
	    	 headers.setLocation(URI.create("/flights/" + flightNumber));
	    	 return new ResponseEntity(toBeAdded, headers, HttpStatus.CREATED);
	     	} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/students/delete/{flightNumber}")
	public ResponseEntity deleteById(@PathVariable("flightNumber") String flightNumber) {
		
		if(service.deleteById(flightNumber)==0) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
