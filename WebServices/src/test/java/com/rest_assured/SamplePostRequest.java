package com.rest_assured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SamplePostRequest {

	@Test
	public void postRequestExample() {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Dharr");
		jsonObject.put("job", "PM");
		
		System.out.println(jsonObject.toString());
		
		
		RestAssured.baseURI="https://reqres.in/";
		
		RestAssured
		.given()
		//.header("Content-Type","application/json")
		//.contentType(ContentType.JSON)
		//.accept(ContentType.JSON)
		.body(jsonObject.toJSONString())
		.post("/api/users")
		.then()
		  .statusCode(201);
		
	}
	
}
