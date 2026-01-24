package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.baseservice.AuthService;
import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListener.class)
public class Logintest {

	@Test(description="verify the login test")
	public void logintest() {
		// TODO Auto-generated method stub
		LoginRequest loginrequest = new LoginRequest("saran123456", "saran123");
	     AuthService authservice = new AuthService();
	     Response response = authservice.login(loginrequest);
	     System.out.println(response.asPrettyString());
	     LoginResponse loginresponse = response.as(LoginResponse.class);
	     System.out.println(loginresponse.getToken());
	     System.out.println(loginresponse.getType());
	     System.out.println(loginresponse.getId());
	     System.out.println(loginresponse.getUsername());
	     System.out.println(loginresponse.getEmail());
	     
	     Assert.assertTrue(loginresponse.getToken() !=null);
	     Assert.assertEquals(loginresponse.getEmail(), "saran90@gmail.com");
	     Assert.assertEquals(loginresponse.getId(), 3454);
		

	}
}
