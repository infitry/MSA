package com.brownfield.pss.client;

import lombok.Data;

@Data
public class Fares {

   	long id;
    
    String fare;
    String currency;

    
	public Fares(String fare,String currency) {
		super();
		this.fare = fare;
		this.currency = currency;
	}

	public Fares() {
		super();
	}
}
