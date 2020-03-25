package com.brownfield.pss.client;
import java.util.Date;

import lombok.Data;

@Data
public class CheckInRecord {
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
