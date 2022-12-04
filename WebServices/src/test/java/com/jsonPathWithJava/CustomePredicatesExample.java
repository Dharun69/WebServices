package com.jsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;

public class CustomePredicatesExample {


	public void myCustomPredicate() throws IOException {
		File jsonFile = new File("src/test/resources/bookstore.json");

		Predicate bookWithISBN = new Predicate() {

			@Override
			public boolean apply(PredicateContext ctx) {

				boolean predicate=ctx.item(Map.class).containsKey("isbn");

				return predicate;
			}

		};
		
		//Predicate bookWithIsbn = ctx->ctx.item(Map.class).containsKey("isbn");

		
		List<Map<String, Object>> result = JsonPath
				.parse(jsonFile)
				.read("$.store.book[?]",List.class, bookWithISBN);

		System.out.println(result);
	}



	public static void main(String[] args) throws IOException {

		CustomePredicatesExample example = new CustomePredicatesExample();
		example.myCustomPredicate();



	}

}
