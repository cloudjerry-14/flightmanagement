package com.bf.management.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bf.management.entity.Flight;

public interface FlightService {

	public  void createFlight(Flight flight);
    ResponseEntity<Flight> updateFlight(Integer id, Flight flight);
	public abstract void deleteFlight(Integer id);
	public  List<Flight> getFlights();

//	public ResponseEntity<Flight> getFlightById(Integer id);

}
