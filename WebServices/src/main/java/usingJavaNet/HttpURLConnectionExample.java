package usingJavaNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

	public void getMethodExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees"); //Create Object for URL class

		HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //Open the URL connection and store it in the parent class

		connection.setRequestMethod("GET"); // set the request type

		connection.connect(); //connect

		int statusCode =	connection.getResponseCode();	// get status code from the connection object and print

		System.out.println("The Status code is "+statusCode); 


		String message = connection.getResponseMessage(); //get the response message and print
		System.out.println("The response message is " + message);	

		InputStream inputStream = connection.getInputStream(); //read the response using getInuptStream

		InputStreamReader reader = new InputStreamReader(inputStream); //create an input stream reader for reading the response body


		BufferedReader bufferedReader = new BufferedReader(reader); //create a buffered reader and pass the input stream reader

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {        //read the lines using readline()

			buffer.append(line);              // create a string buffer and store the lines read inside the loop.
		}
		System.out.println(buffer);

	}

	public void postMethodExample() throws IOException {

		URL url = new URL("	https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection =  (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"dharrr\",\"salary\":\"500000\",\"age\":\"23\"}";

		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);

		System.out.println("Response code :"+ connection.getResponseCode());

		System.out.println("Response message "+ connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream(); //read the response using getInuptStream

		InputStreamReader reader = new InputStreamReader(inputStream); //create an input stream reader for reading the response body


		BufferedReader bufferedReader = new BufferedReader(reader); //create a buffered reader and pass the input stream reader

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {        //read the lines using readline()

			buffer.append(line);              // create a string buffer and store the lines read inside the loop.
		}
		System.out.println(buffer);


	}
	
	public void putRequestExample() throws IOException {
		
		URL url = new URL("	https://dummy.restapiexample.com/api/v1/update/9659");
		HttpURLConnection connection =  (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"dharrr\",\"salary\":\"500000\",\"age\":\"28\"}";

		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);

		System.out.println("Response code :"+ connection.getResponseCode());

		System.out.println("Response message "+ connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream(); //read the response using getInuptStream

		InputStreamReader reader = new InputStreamReader(inputStream); //create an input stream reader for reading the response body


		BufferedReader bufferedReader = new BufferedReader(reader); //create a buffered reader and pass the input stream reader

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {        //read the lines using readline()

			buffer.append(line);              // create a string buffer and store the lines read inside the loop.
		}
		System.out.println(buffer);

		
	}
	
	public void deleteRequestExample() throws IOException {
		URL url = new URL("	https://dummy.restapiexample.com/api/v1/delete/9659");
		HttpURLConnection connection =  (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

	
		System.out.println("Response code :"+ connection.getResponseCode());

		System.out.println("Response message "+ connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream(); //read the response using getInuptStream

		InputStreamReader reader = new InputStreamReader(inputStream); //create an input stream reader for reading the response body


		BufferedReader bufferedReader = new BufferedReader(reader); //create a buffered reader and pass the input stream reader

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {        //read the lines using readline()

			buffer.append(line);              // create a string buffer and store the lines read inside the loop.
		}
		System.out.println(buffer);

		
	}
	public static void main(String[] args) throws IOException {
		HttpURLConnectionExample connectionExample = new HttpURLConnectionExample();
		connectionExample.getMethodExample();
		//connectionExample.postMethodExample(); //id 9659
		//connectionExample.putRequestExample();
		//connectionExample.deleteRequestExample();
	}

}