package api;

import com.api.pojos.auth.request.AuthRequest;
import com.api.pojos.auth.response.AuthResponse;
import com.api.pojos.createbooking.request.Bookingdates;
import com.api.pojos.createbooking.request.CreateBookingRequest;
import com.api.pojos.createbooking.response.CreateBookingResponse;
import com.api.pojos.getbooking.GetBookingResponse;
import com.api.steps.BookingSteps;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class RestTest {

    public static final RequestSpecification REQUEST_SPECIFICATION =
            new RequestSpecBuilder()
                    .setBaseUri("https://restful-booker.herokuapp.com")
                    .setContentType(ContentType.JSON)
                    .build();

    @Test
    public void createTokenTest() {
        AuthRequest rq = new AuthRequest();
        rq.setUsername("admin");
        rq.setPassword("password123");

        AuthResponse rs = given()
                .spec(REQUEST_SPECIFICATION)
                .basePath("/auth")
                .body(rq)
                .when().post()
                .then().statusCode(200)
                .extract().as(AuthResponse.class);
    }

    @Test
    public void postAndGetBookingTest() {
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2021-06-22");
        bookingdates.setCheckout("2021-06-28");
        CreateBookingRequest createBookingRequest = new CreateBookingRequest();
        createBookingRequest.setFirstname("Roman");
        createBookingRequest.setLastname("Surname");
        createBookingRequest.setDepositpaid(true);
        createBookingRequest.setTotalprice(1000);
        createBookingRequest.setAdditionalneeds("Comfortable bed");
        createBookingRequest.setBookingdates(bookingdates);

        BookingSteps bookingSteps = new BookingSteps();
        CreateBookingResponse createBookingResponse = bookingSteps.createBooking(createBookingRequest);
        GetBookingResponse createdBooking = bookingSteps.getLastBooking();

        assertThat(createBookingResponse)
                .isNotNull();

        assertThat(createdBooking)
                .isNotNull();


    }

}