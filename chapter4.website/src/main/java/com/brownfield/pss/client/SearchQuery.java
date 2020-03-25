package com.brownfield.pss.client;

import lombok.Data;

@Data
public class SearchQuery {
	String origin;
	String destination;
	String flightDate;
	
	
	public SearchQuery() {
		super();
	}

	public SearchQuery(String origin, String destination, String flightDate) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
	}
}