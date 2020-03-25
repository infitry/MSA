package com.brownfield.pss.checkin.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CheckInRecord {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	long id;
    
    String lastName;
    String firstName;
    String seatNumber;
    Date checkInTime;
    String flightNumber;
    String flightDate;
    long bookingId;
 
    public CheckInRecord(){
    	
    }
 	
	public CheckInRecord(String lastName, String firstName, String seatNumber, Date checkInTime, String flightNumber,
			String flightDate, long bookingId) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.seatNumber = seatNumber;
		this.checkInTime = checkInTime;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.bookingId = bookingId;
	}
}
