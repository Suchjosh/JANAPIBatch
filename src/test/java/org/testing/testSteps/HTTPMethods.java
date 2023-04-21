package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}

	public Response postRequest(String uriKey,String requestbodyData) 
	{
		String uriValue=pr.getProperty(uriKey);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestbodyData)
		.when()
		.post(uriValue);
		System.out.println("Status code is " +res.getStatusCode());
		return res;
	}
	
	public Response getRequest(String uriKey,String idvalue) 
	{
		String uriValue=pr.getProperty(uriKey)+"/"+idvalue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("Status code is  " +res.getStatusCode());
		System.out.println("Response Data is");
		System.out.println(res.asString());
		return res;
		
	}
	public Response getAllRequest(String urikey) 
	{
		String urivalue=pr.getProperty(urikey);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(urivalue);
		System.out.println("Status code is  " +res.getStatusCode());
		System.out.println("Response Data is");
		System.out.println(res.asString());
		return res;
	}

	public Response PutRequest(String urikey, String requestbody, String idvalue) {
		String uriValue=pr.getProperty(urikey)+ "/"+idvalue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestbody)
		.when()
		.put(uriValue);
		System.out.println("Status code is " +res.getStatusCode());
		System.out.println("After update response Data is");
		System.out.println(res.asString());
		return res;
			
	}

	public Response deleteRequest(String uriKey,String idvalue) 
	{
		String uriValue=pr.getProperty(uriKey)+"/"+idvalue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uriValue);
		System.out.println("Status code is  " +res.getStatusCode());
		System.out.println("Response Data is");
		System.out.println(res.asString());
		
		return res;
	}
}


