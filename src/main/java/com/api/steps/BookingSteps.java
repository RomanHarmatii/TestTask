package com.api.steps;

import com.api.pojos.createbooking.request.CreateBookingRequest;
import com.api.pojos.createbooking.response.CreateBookingResponse;
import com.api.pojos.getbooking.GetBookingResponse;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BookingSteps {
    public static final RequestSpecification REQUEST_SPECIFICATION =
            new RequestSpecBuilder()
                    .setBaseUri("https://restful-booker.herokuapp.com")
                    .setBasePath("/booking")
                    .setContentType(ContentType.JSON)
                    .build();
    private CreateBookingResponse createdBooking;
    public CreateBookingResponse createBooking(CreateBookingRequest createBookingRequest){
        createdBooking = given().spec(REQUEST_SPECIFICATION).body(createBookingRequest).post().as(CreateBookingResponse.class);
        return createdBooking;
    }

    public GetBookingResponse getLastBooking(){
        return given().get("https://restful-booker.herokuapp.com/booking/" + createdBooking.getBookingid()).as(GetBookingResponse.class);
    }
    public Response deleteLastBooking(){
        return given().delete("https://restful-booker.herokuapp.com/booking/" + createdBooking.getBookingid());
    }
}
