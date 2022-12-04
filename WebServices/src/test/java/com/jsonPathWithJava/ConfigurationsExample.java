package com.jsonPathWithJava;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class ConfigurationsExample {






	public static void main(String[] args) {



		String json = "[\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"dharun\",\r\n"
				+ "                \"gender\": \"male\"      \r\n"
				+ "            },\r\n"
				+ "{\r\n"
				+ "        \"name\": \"sar\",\r\n"
				+ "                \"gender\": \"male\"      \r\n"
				+ "            }\r\n"
				+ "]";


		Configuration configuration = Configuration.defaultConfiguration();

		String result = JsonPath
				.using(configuration)
				.parse(json)
				.read("$.[0].ndame");

		System.out.println(result);

	}
}