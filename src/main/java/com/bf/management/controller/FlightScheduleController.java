package com.bf.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bf.management.entity.FlightSchedule;
import com.bf.management.repository.FlightScheduleRepo;
import com.bf.management.service.FlightScheduleService;

@RestController
@CrossOrigin(origins = "*")
public class FlightScheduleController {

	@Autowired
	private FlightScheduleService fss;

	@Autowired
	private FlightScheduleRepo fssRepo;


	@PostMapping("/scheduleflight")
	   public String scheduleFlight(@RequestBody FlightSchedule flight) {
	      fss.createScheduleFlight(flight);
	      return "flight is scheduled successfully";
	   }

	@PutMapping("/updatescheuledflight/{id}")
	public ResponseEntity<FlightSchedule> updateScheduleFlight(@PathVariable  Integer scheduleid,@RequestBody FlightSchedule flightSchedule){

		FlightSchedule f= fssRepo.findById(scheduleid).orElseThrow();

		//f.setId(flight.getflightId());
		f.setArrival(flightSchedule.getArrival());
		f.setDeparture(flightSchedule.getDeparture());
		f.setArrivalTime(flightSchedule.getArrivaTime());
		f.setDepartureTime(flightSchedule.getDepartureTime());
		f.setFare(flightSchedule.getFare());
		FlightSchedule updateflight = fssRepo.save(f);

		return ResponseEntity.ok(updateflight);

	}
	@GetMapping("/getScheduledFlights")
	public List<FlightSchedule> getScheduledFlights(){
		return fss.getScheduledFlights();

	}


	@DeleteMapping("/deleteFlightSchedule/{id}")
	public String deleteScheduleFlight(@PathVariable Integer id) {
		fss.deleteScheduledFlight(id);
		return "flight deleted successfully";

	}

	@GetMapping("/searchflights/{departure},{arrival}")
	public ResponseEntity<List<FlightSchedule>> searchFlights(@PathVariable String departure,@PathVariable String arrival) {
		//fss.searchFlights(departure, arrival);
		return new ResponseEntity<>(fss.searchFlights(departure, arrival),HttpStatus.OK);
	}

}
