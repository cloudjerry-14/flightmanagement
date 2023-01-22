package com.bf.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bf.management.entity.FlightSchedule;
import com.bf.management.repository.FlightScheduleRepo;

@Service
public  class FlightScheduleServiceImpl implements FlightScheduleService{

	@Autowired
	private FlightScheduleRepo flightScheduleRepo;


	@Override
	public void createScheduleFlight(FlightSchedule flight) {

		flightScheduleRepo.save(flight);
	}

	@Override
	public void deleteScheduledFlight(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public ResponseEntity<FlightSchedule> updateScheduleFlight(Integer id, FlightSchedule fss) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlightSchedule> getScheduledFlights() {
		// TODO Auto-generated method stub
		return flightScheduleRepo.findAll();
	}
	@Override
	public List<FlightSchedule> searchFlights(String departure,String arrival){

		return flightScheduleRepo.searchFlights(departure,arrival);
	}

}
