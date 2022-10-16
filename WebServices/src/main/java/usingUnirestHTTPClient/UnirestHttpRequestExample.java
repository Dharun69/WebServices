package usingUnirestHTTPClient;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttpRequestExample {

	public void getRequestExample() throws UnirestException {
		
		HttpResponse<JsonNode> jsonResponse=Unirest.get("https://dummy.restapiexample.com/api/v1/employees	").asJson();
		
		System.out.println("Status code :"+ jsonResponse.getStatus());
		System.out.println("Status message :"+ jsonResponse.getStatusText());
		System.out.println("Response Body :" + jsonResponse.getBody());
	}
	
	public void postRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse =	Unirest.post("https://dummy.restapiexample.com/api/v1/create").
		body("{\"name\":\"carr\",\"salary\":\"454545\",\"age\":\"25\"}").asJson();
		
		System.out.println("Status code :"+ jsonResponse.getStatus());
		System.out.println("Status message :"+ jsonResponse.getStatusText());
		System.out.println("Response Body :" + jsonResponse.getBody());
	}
	
	public void putRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse =	Unirest.put("https://dummy.restapiexample.com/api/v1/update/7904").
				body("{\"name\":\"carr\",\"salary\":\"25656\",\"age\":\"27\"}").asJson();
				
				System.out.println("Status code :"+ jsonResponse.getStatus());
				System.out.println("Status message :"+ jsonResponse.getStatusText());
				System.out.println("Response Body :" + jsonResponse.getBody());
			}
	
	public void deleteRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse =	Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/7904").asJson();
				
				System.out.println("Status code :"+ jsonResponse.getStatus());
				System.out.println("Status message :"+ jsonResponse.getStatusText());
				System.out.println("Response Body :" + jsonResponse.getBody());
			}
	
	public static void main(String[] args) throws UnirestException {
		UnirestHttpRequestExample example = new UnirestHttpRequestExample();
		example.getRequestExample();
		//example.postRequestExample(); //7904
		//example.putRequestExample();
		//example.deleteRequestExample();
	}

}
