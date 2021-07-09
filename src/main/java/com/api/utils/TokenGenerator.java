package com.api.utils;

import com.api.pojos.auth.request.AuthRequest;
import com.api.pojos.auth.response.AuthResponse;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class TokenGenerator {
    public static final RequestSpecification REQUEST_SPECIFICATION =
            new RequestSpecBuilder()
                    .setBaseUri("https://restful-booker.herokuapp.com")
                    .setContentType(ContentType.JSON)
                    .build();

    public String getToken(){
        AuthRequest rq = new AuthRequest();
        rq.setUsername("admin");
        rq.setPassword("password123");

        AuthResponse authResponse = given()
                .spec(REQUEST_SPECIFICATION)
                .basePath("/auth")
                .body(rq)
                .when().post()
                .then().statusCode(200)
                .extract().as(AuthResponse.class);

        return authResponse.getToken();
    }
}
