package com.rest_assured_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestBDDStyle {

	@Test
	public void getAllEmployeesBDD() {
		
		RestAssured
		.given()
		    .baseUri("http://localhost:3000/")
		.when()
	    	.get("employees")
		.prettyPrint();	
		
	}
	
	@Test
	public void createAnEmployeeBDD() {
		
		RestAssured
		.given()
		  .baseUri("http://localhost:3000/")
		  .header("Content-Type","application/json")
		  .body("{\r\n"
		  		+ "\"first_name\": \"sel\",\r\n"
		  		+ "\"last_name\": \"k\",\r\n"
		  		+ "\"email\": \"sel@codingthesmartway.com\"\r\n"
		  		+ "}")
		  .when()
		  .post("employees")
		  .prettyPrint();
		  
		  }
	
	@Test
	public void updateAnEmployeeBDD() {
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"first_name\": \"rav\",\r\n"
				+ "\"last_name\": \"k\",\r\n"
				+ "\"email\": \"rav@codingthesmartway.com\"\r\n"
				+ "}")
		.when()
		.put("/employees/55")
		.prettyPrint();
	}
	
	@Test
	public void deleteAnEmployee() {
		
		RestAssured 
		.given()
		.baseUri("http://localhost:3000/")
		.when()
		.delete("employees/55")
		.prettyPrint();
		
	}
	
	
	
}
