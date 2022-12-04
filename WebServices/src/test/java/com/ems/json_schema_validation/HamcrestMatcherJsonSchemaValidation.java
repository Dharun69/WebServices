package com.ems.json_schema_validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcherJsonSchemaValidation {


	@Test
	public void validate() throws IOException {

		File inputJson = new File("src/test/resources/input.json");


		String jsonContent = FileUtils.readFileToString(inputJson, "UTF-8");

		InputStream jsonSchema = new FileInputStream("src/test/resources/schema.json");

		MatcherAssert.assertThat(jsonContent, 
				JsonSchemaValidator.matchesJsonSchema(jsonSchema));
		
		

	}
}
