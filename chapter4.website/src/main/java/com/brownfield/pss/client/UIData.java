package com.brownfield.pss.client;

import java.util.List;

import lombok.Data;

@Data
public class UIData {
	
	private SearchQuery searchQuery;
	private List<Flight> flights;
	private Flight selectedFlight;
	private Passenger passenger;

	private String bookingid;
}