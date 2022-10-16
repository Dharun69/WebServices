package com.rest_assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class GetRequestExample {

	@Test
	public void getRequestExample() {

		Response response = RestAssured.get("https://reqres.in/api/users/2");

		//response.getBody();
		ResponseBody body =  response.body();
	

		//System.out.println(body.asString());
		System.out.println(body.asPrettyString());
	}

	@Test
	public void anotherGetRequestExample() {

		RestAssured.baseURI="https://reqres.in/";

	 Response response= RestAssured   //ValidatableResponse for then.
		.given()           //set param , header
	       	.param("", "")
	   	.when()
	    	.get("/api/users/2");
	  //  .then()
	  //       .statusCode(200);   //When we use the 'then' function, then we need to use ValidatableResponse.

	System.out.println(response.asPrettyString());
	}

}
