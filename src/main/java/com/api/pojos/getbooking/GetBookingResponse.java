package com.api.pojos.getbooking;

import com.api.pojos.createbooking.request.Bookingdates;

public class GetBookingResponse{
	private String firstname;
	private String additionalneeds;
	private Bookingdates bookingdates;
	private int totalprice;
	private boolean depositpaid;
	private String lastname;

	public String getFirstname(){
		return firstname;
	}

	public String getAdditionalneeds(){
		return additionalneeds;
	}

	public Bookingdates getBookingdates(){
		return bookingdates;
	}

	public int getTotalprice(){
		return totalprice;
	}

	public boolean isDepositpaid(){
		return depositpaid;
	}

	public String getLastname(){
		return lastname;
	}
}
