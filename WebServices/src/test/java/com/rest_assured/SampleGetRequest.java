package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequest {

	public static void main(String[] args) {


		Response response= RestAssured.get("https://www.google.com");
		int statusCode = 	response.statusCode();
		System.out.println("The status code is :"+ statusCode);

		String statusLine =	response.statusLine();
		System.out.println("The status line is "+ statusLine);


	}

}
