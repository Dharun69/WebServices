package com.rest_assured_nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestNonBDD {

	@Test(enabled = false)
	public void GetAllEmployees() {

		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET,"employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

	}

	@Test
	public void createAnEmployee() {

		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = 
				RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "\"first_name\": \"harsh\",\r\n"
						+ "\"last_name\": \"k\",\r\n"
						+ "\"email\": \"harsh@codingthesmartway.com\"\r\n"
						+ "}");

		Response response = requestSpecification.request(Method.POST, "employees");

		System.out.println(response.statusLine());
		System.out.println(response.asPrettyString());

	}


	@Test
	public void updateAnEmployee() {

		RestAssured.baseURI="http://localhost:3000/";

		RequestSpecification requestSpecification=	RestAssured
				.given()
				.header("Content-Type", "application/json")
				.body("{\r\n"
						+ "\"first_name\": \"antooo53\",\r\n"
						+ "\"last_name\": \"k\",\r\n"
						+ "\"email\": \"CARRR53@codingthesmartway.com\"\r\n"
						+ "}");

		Response response =	requestSpecification.request(Method.PUT, "employees/53");


		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());	

	}


	@Test
	public void deleteAnEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/";
		
	RequestSpecification requestSpecification =	RestAssured.given();
	
	Response response = requestSpecification.request(Method.DELETE, "employees/14");
	
	System.out.println(response.asPrettyString());
	System.out.println(response.statusCode());
	}
	
	@Test()
	public void GetAnEmployees() {

		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET,"employees/21");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

	}

}
