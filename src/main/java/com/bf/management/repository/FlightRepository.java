package com.bf.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bf.management.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{

//	@Query("Select * from flight where id=1?")
//	public Flight getFlightById(Integer id);

}
