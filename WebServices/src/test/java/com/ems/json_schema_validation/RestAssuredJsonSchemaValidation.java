package com.ems.json_schema_validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {


	@Test (enabled = false)
	public void validationusingJsonSchemaInClassPath() {

		File inputJson = new File("src/test/resources/input.json");

		RestAssured
		.given()
		.baseUri("http://localhost:3000/employees")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));//if schema is in the resource use classpath
	}

	@Test 
	public void validationUsingMatchesJsonSchema() throws FileNotFoundException {
		File inputJson = new File("src/test/resources/input.json");

		InputStream inputSchema = new FileInputStream("src/test/resources/schema.json"); //Assume the schemafile is not in resource

		RestAssured
		.given()
		.baseUri("http://localhost:3000/employees")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(inputSchema));
	}
	
	
}
