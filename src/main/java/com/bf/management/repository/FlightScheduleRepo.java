package com.bf.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bf.management.entity.FlightSchedule;

@Repository
public interface FlightScheduleRepo extends JpaRepository<FlightSchedule, Integer> {

	@Query(value = "SELECT * FROM brookfield.flight_scheduler where departure=:departure and arrival=:arrival" , nativeQuery = true)
    List<FlightSchedule> searchFlights(@Param("departure") String departure,@Param("arrival") String arrival);

}
