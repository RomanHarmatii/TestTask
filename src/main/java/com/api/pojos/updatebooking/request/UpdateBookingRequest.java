package com.api.pojos.updatebooking.request;

import com.api.pojos.createbooking.request.Bookingdates;

public class UpdateBookingRequest {
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}

	public void setBookingdates(Bookingdates bookingdates) {
		this.bookingdates = bookingdates;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public void setDepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

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
