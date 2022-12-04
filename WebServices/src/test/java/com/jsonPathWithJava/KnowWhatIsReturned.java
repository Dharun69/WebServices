package com.jsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class KnowWhatIsReturned {


	//Definite Path  -- It will return only one value
	
	//Indefinite Path  -- We can't sure how many elements will come

	//.. deep scan -- indefinite 
	//?(expression) 
	//[0,1] or [0:2] [*]
	
	
	public static void main(String[] args) throws IOException {

		File jsonFile =  new File("src/test/resources/bookstore.json");

		String priceList = 	JsonPath.read(jsonFile, "$.store.book[2].author");


		System.out.println(priceList);



	}
}
