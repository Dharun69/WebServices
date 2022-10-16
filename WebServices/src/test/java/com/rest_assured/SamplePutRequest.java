package com.rest_assured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SamplePutRequest {

	@Test
	public void putRequestExample() {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "dharr");
		jsonObject.put("job", "cm");

		baseURI="https://reqres.in/";


		given()
		.when()
		.body(jsonObject.toJSONString())
		.patch("/api/users/2")
		.then()
		.statusCode(200);

	}

	@Test
	public void deleteRequestExample() {

		baseURI="https://reqres.in/";

		given()
		.when()
		.delete("/api/users/2")
		.then()
		.statusCode(204);

	}
}
