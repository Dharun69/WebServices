package com.jsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.jayway.jsonpath.JsonPath;

public class InLinePredicateExample {


	File jsonFile = new File("src/test/resources/bookstore.json");

	public  void inLinePredicate() throws IOException {
		//$.store.book[?(@.price<10)]  //inline predicate
		List<Object> result =	JsonPath.parse(jsonFile)
				.read("store.book[?( ! (@.price>10 || @.category=='reference'))]");

		System.out.print(result);


		// price < 10 and category = fiction

		
		//  store.book[?(@.price<10 && @.category=='fiction')]

		// price >10 || category = reference
		// store.book[?(@.price>10 || @.category=='reference')]

		//not(!)
		// store.book[?(! (@.price>10 || @.category=='reference'))]

	}


	public static void main(String[] args) throws IOException {



		InLinePredicateExample example = new InLinePredicateExample();
		example.inLinePredicate();
	}

}
