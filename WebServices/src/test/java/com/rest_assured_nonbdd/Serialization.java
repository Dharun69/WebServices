package com.rest_assured_nonbdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serialization {
	
	//data is obtained  //add json simple or jackson databind

	@Test
	public void serialization() {
		
		Map<String, Object> jsonBody = new HashMap<String, Object>();
		
		List<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("selenium");
		
		
		
		jsonBody.put("first_name", "dhar");
		jsonBody.put("last_name", "A");
		jsonBody.put("email", "dhar@");
		jsonBody.put("Skills", skills);
		
		System.out.println(jsonBody);
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type", "application/json")
		.body(jsonBody)
		.log()
		.all()
		.when()
		.post("employees")
		.then()
		.log()
		.all();
	}
	
}
