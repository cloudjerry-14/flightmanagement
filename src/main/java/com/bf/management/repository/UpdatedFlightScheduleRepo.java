package com.bf.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bf.management.entity.UpdatedFlightSchedule;

@Repository
public interface UpdatedFlightScheduleRepo extends JpaRepository<UpdatedFlightSchedule,Integer > {

}
