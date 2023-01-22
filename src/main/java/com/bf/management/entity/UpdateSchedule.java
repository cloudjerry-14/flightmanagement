package com.bf.management.entity;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "updateSchedule")
@Component(value = "updateSchedule")
public class UpdateSchedule {
	
	@Id
	@Column(name ="scheduleId")
	private Integer updateScheduleId;
	
	@Column(name = "newDepartreTime")
	private LocalDateTime newDepartreTime;
	
	@Column(name = "newArrivalTime")
	private LocalDateTime newArrivalTime;

//	@OneToOne(mappedBy = "updateSchedule" ,cascade = CascadeType.ALL)
//	private FlightSchedule flightSchedule;

	
	public Integer getUpdateScheduleId() {
		return updateScheduleId;
	}

	public void setUpdateScheduleId(Integer updateScheduleId) {
		this.updateScheduleId = updateScheduleId;
	}

	public LocalDateTime getNewDepartreTime() {
		return newDepartreTime;
	}

	public void setNewDepartreTime(LocalDateTime newDepartreTime) {
		this.newDepartreTime = newDepartreTime;
	}

	public LocalDateTime getNewArrivalTime() {
		return newArrivalTime;
	}

	public void setNewArrivalTime(LocalDateTime newArrivalTime) {
		this.newArrivalTime = newArrivalTime;
	}

//	public FlightSchedule getFs() {
//		return flightSchedule;
//	}
//
//	public void setFs(FlightSchedule fs) {
//		this.flightSchedule =fs;
//	}
	
	

}
