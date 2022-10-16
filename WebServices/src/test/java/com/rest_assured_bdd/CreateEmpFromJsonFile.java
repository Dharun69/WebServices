package com.rest_assured_bdd;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateEmpFromJsonFile {

	
	
	@Test
	public void createAnEmployeeFromJsonFile() {
		
		
		File jsonFile = new File("postData.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(jsonFile)
		.when()
		.post("/employees")
		.prettyPrint();
		
	}
	
	
	
}
