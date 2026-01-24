package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginDemo {

	@Test(description="verify the login test")
	public void logintest() {
		// TODO Auto-generated method stub
		RestAssured.baseURI="http://64.227.160.186:8080/";
		RequestSpecification x =RestAssured.given();
        RequestSpecification y =x.header("Content-Type", "application/json");
       RequestSpecification z=  y.body("{\r\n"
        		+ "  \"username\": \"saran123456\",\r\n"
        		+ "  \"password\": \"saran123\"\r\n"
        		+ "}");
       Response response = z.post("api/auth/login");
       
       System.out.println(response.asPrettyString());
       
       Assert.assertEquals(response.getStatusCode(), 200);
        
		

	}
}
