package com.brownfield.pss.client;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data 
public class Passenger {

  	long id;
    
    String firstName;
    String lastName;
    String gender;
    
    @JsonIgnore
    private BookingRecord bookingRecord;
    
	public Passenger() {
	}    
    
	public Passenger(String firstName, String lastName, String gender,BookingRecord bookingRecord ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.bookingRecord= bookingRecord;
	}
}
