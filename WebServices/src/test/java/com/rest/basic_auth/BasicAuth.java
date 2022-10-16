package com.rest.basic_auth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicAuth {

	@Test
	public void getData() {	
		RestAssured
		.given()
		.auth()
		.basic("postman", "password")
		.baseUri("https://postman-echo.com/")
		.when()
		.get("basic-auth")
		.prettyPrint();
			
	}
	
	
	
}
