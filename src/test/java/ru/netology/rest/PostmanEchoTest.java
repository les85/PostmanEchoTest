package ru.netology.rest;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {

    @Test
    void ShouldReturnSendData() {
        String text = "Hi";
        given()
                .baseUri("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("dat", org.hamcrest.Matchers.equalTo(text));
    }
}
