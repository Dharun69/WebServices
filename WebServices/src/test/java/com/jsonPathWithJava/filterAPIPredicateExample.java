package com.jsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import static com.jayway.jsonpath.Criteria.where;
import static com.jayway.jsonpath.Filter.*;

public class filterAPIPredicateExample {

	File jsonFile = new File("src/test/resources/bookstore.json");


	public void filterAPIPredicate() throws IOException {


		Filter priceLessThanTen =  Filter
				.filter(
						Criteria
						.where("price")
						.lt(10));


		List<Object> result =	JsonPath
				.parse(jsonFile)
				.read("$.store.book[?]" , priceLessThanTen);

		System.out.println(result);
	}

	public void secondFilter() throws IOException {
		// price < 10 and category = fiction

		Filter secondCriteria =	Filter.filter(

				Criteria
				.where("price")
				.lt(10)
				.and("category")
				.is("fiction")
				);

		List<Map<String, Object>>  secondResult = JsonPath.parse(jsonFile).read("$.store.book[?]", secondCriteria);

		System.out.println(secondResult);
	}


	public void thirdFilter() throws IOException {
		// price >10 || category = reference

		Filter thridCriteria = filter(

				where("price")
				.gt(10)
				.and("category")
				.is("fiction")
				);


		List<Object> thridResult = JsonPath.parse(jsonFile).read("$.store.book[?]", thridCriteria );
		System.out.println(thridResult);



	}


	public static void main(String[] args) throws IOException {


		filterAPIPredicateExample example = new filterAPIPredicateExample();
		example. thirdFilter();

	}

}
