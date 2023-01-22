package com.bf.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bf.management.entity.Flight;
import com.bf.management.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

@Autowired
private FlightRepository flightRepo;



	@Override
	public void createFlight(Flight flight) {
		flightRepo.save(flight);

	}


	@Override
	public ResponseEntity<Flight> updateFlight(Integer id, Flight flight) {
		Flight f=flightRepo.findById(id).orElseThrow();
		return ResponseEntity.ok(f);

	}


	@Override
	public void deleteFlight(Integer id) {
		flightRepo.deleteById(id);

	}


	@Override
	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		List<Flight> allFlights=flightRepo.findAll();
		return allFlights;
	}

//	@Override
//	public ResponseEntity<Flight> getFlightById(Integer id){
//		Flight f = flightRepo.getFlightById(id);
//		return ResponseEntity.ok(f);
//	}



}
