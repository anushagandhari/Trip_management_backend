package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bus")
public class Bus {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column
	Long busId;
	
	@Column
	String busType;
	
	@Column
	String busNumber ;
	
	@Column
	int capacity;
     
	
	
	public Bus(Long busId, String busType, String busNumber, int capacity) {
		super();
		this.busId = busId;
		this.busType = busType;
		this.busNumber = busNumber;
		this.capacity = capacity;
	}

	public Long getBusId() {
		return busId;
	}

	public void setBusId(Long busId) {
		this.busId = busId;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	
	
}
