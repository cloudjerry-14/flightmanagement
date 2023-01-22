package com.bf.management.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bf.management.entity.FlightSchedule;

public interface FlightScheduleService {

	public void createScheduleFlight(FlightSchedule flight);

   	public void deleteScheduledFlight(Integer id);

   	ResponseEntity<FlightSchedule> updateScheduleFlight(Integer id,FlightSchedule fss);

	public List<FlightSchedule> getScheduledFlights();

    public List<FlightSchedule> searchFlights(String departure,String arrival);
	 
	 
}
