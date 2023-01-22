package com.bf.management.entity;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "flightScheduler")
@Component(value ="flightScheduler")
public class FlightSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="scheduleId")
	private Integer scheduleId;
	@Column(name="departure")
	private String departure;
	@Column(name="arrival")
	private String arrival;

	@Column(name="departureTime")
	private LocalDateTime departureTime;

	@Column(name="arrivalTime")
	private LocalDateTime arrivalTime;

	@Column(name="fare")
	private Double fare;


	@OneToOne(fetch = FetchType.EAGER)
	private Flight flight;

//	@OneToOne(mappedBy = "flightScheduler",cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REMOVE},fetch = FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	private UpdateSchedule updateSchedule;
//	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}





//	public FlightSchedule( String departure, String arrival, LocalDateTime departureTime,
//			LocalDateTime arrivalTime, Double fare, Flight flight) {
//		super();
//
//		this.departure = departure;
//		this.arrival = arrival;
//		this.departureTime = departureTime;
//		this.arrivalTime = arrivalTime;
//		this.fare = fare;
//		this.flight = flight;
//	}

	public int getscheduleId() {
		return scheduleId;
	}
	public void setId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalDateTime getArrivaTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
//	public UpdateSchedule getUpdateSchedule() {
//		return updateSchedule;
//	}
//	public void setUpdateSchedule(UpdateSchedule updateSchedule) {
//		this.updateSchedule = updateSchedule;
//	}
	@Override
	public String toString() {
		return "FlightSchedule [scheduleId=" + scheduleId + ", departure=" + departure + ", arrival=" + arrival
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", fare=" + fare + ", flight="
				+ flight + "]";
	}


}
