package com.rakuten.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.rakuten.model.Flight;

public class AdminRepoImpl implements AdminRepo {

	@Autowired
	EntityManager em;
	
	@Override
	public List<Flight> findAll() {
		Query q = em.createQuery("select f from Flight as f");
		return q.getResultList();
	}

	@Override
	public Flight findById(String flightNumber) {
		return em.find(Flight.class, flightNumber);
	}

	@Override
	public Flight addFlight(Flight toBeAdded) {
		em.persist(toBeAdded);
		return toBeAdded;
	}

	@Override
	public void updateFlight(Flight toBeUpdated) {
		em.merge(toBeUpdated);
	}

	@Override
	public void deleteFlight(Flight toBeDeleted) {
		em.remove(toBeDeleted);

	}

}
