package com.api.baseservice;


import com.api.filters.LoggingFilters;
import com.api.model.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class BaseService {
	
	static{
		RestAssured.filters(new LoggingFilters());
	}

	public static final String BASE_URL= "http://64.227.160.186:8080/";
	//public static final String BASE_URL= "https://swift.techwithjatin.com/";
	
	private RequestSpecification requestspecification;
	
	public  BaseService(){
		
		requestspecification = RestAssured.given().baseUri(BASE_URL);
		
	}
	
	protected Response getRequest(String endpoint) {
		
		return requestspecification.get(endpoint);
		
	}
	
	protected void setReponsetoken(String token) {
		requestspecification.header("Authorization", "Bearer "+token);
	}
	protected Response PostRequest(Object payload, String endpoint) { //object is superparent so using as generic
		
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoint);
		
	}
protected Response PutRequest(Object payload, String endpoint) { //object is superparent so using as generic
		
		return requestspecification.contentType(ContentType.JSON).body(payload).put(endpoint);
		
	}
	
}

