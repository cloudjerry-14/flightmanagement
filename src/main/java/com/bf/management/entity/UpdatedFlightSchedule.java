package com.bf.management.entity;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "updatedFlightSchedule")
@Component(value = "updatedFlightSchedule")
public class UpdatedFlightSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="updatedFlightScheduleId")
	private Integer updatedFlightScheduleId;

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

	@Column(name="updatedDepartureTime")
	private LocalDateTime updatedDepartureTime;

	@Column(name="updatedArrivalTime")
	private LocalDateTime updatedArrivalTime;

	@OneToOne
	private FlightSchedule fs;


	public Integer getUpdatedFlightScheduleId() {
		return updatedFlightScheduleId;
	}

	public void setUpdatedFlightScheduleId(Integer updatedFlightScheduleId) {
		this.updatedFlightScheduleId = updatedFlightScheduleId;
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

	public LocalDateTime getArrivalTime() {
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

	public LocalDateTime getUpdatedDepartureTime() {
		return updatedDepartureTime;
	}

	public void setUpdatedDepartureTime(LocalDateTime updatedDepartureTime) {
		this.updatedDepartureTime = updatedDepartureTime;
	}

	public LocalDateTime getUpdatedArrivalTime() {
		return updatedArrivalTime;
	}

	public void setUpdatedArrivalTime(LocalDateTime updatedArrivalTime) {
		this.updatedArrivalTime = updatedArrivalTime;
	}

}
