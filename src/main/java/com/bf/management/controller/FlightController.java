package com.bf.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bf.management.Exception.FlightNotFoundException;
import com.bf.management.entity.Flight;
import com.bf.management.repository.FlightRepository;
import com.bf.management.service.FlightService;

@RestController
@CrossOrigin(origins = "*")
public class FlightController  {

	@Autowired
	FlightService flightService;

	@Autowired
	private FlightRepository flightRepository;


	@PostMapping("/createflight")
	   public String createFlight(@RequestBody Flight flight) {
	      flightService.createFlight(flight);
	      return "flight is created successfully";
	   }

	@PutMapping("/update/{id}")
	public ResponseEntity<Flight> updateFlight(@PathVariable  Integer id,@RequestBody Flight flight) throws FlightNotFoundException{

		Flight f=flightRepository.findById(id).orElseThrow();
		//f.setId(flight.getflightId());
		f.setFlightModel(flight.getFlightModel());
		f.setCarrierName(flight.getCarrierName());
		f.setFlightModel(flight.getFlightModel());

		Flight updateflight = flightRepository.save(f);

		return ResponseEntity.ok(updateflight);

	}



	@DeleteMapping("/deleteFlight/{id}")
	public String deleteFlight(@PathVariable Integer id) {
		flightService.deleteFlight(id);
		return "flight deleted successfully";

	}

	@GetMapping("/allFlights")
	public List<Flight> allFlights(){
		return flightService.getFlights();
	}

//	@GetMapping("/getflightbyid/{id}")
//	public String getFlightById(@PathVariable Integer id) {
//		flightService.getFlightById(id);
//		return flightService.getFlightById(id);;
//	}

}
