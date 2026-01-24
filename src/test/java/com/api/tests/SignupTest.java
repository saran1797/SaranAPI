package com.api.tests;

import org.testng.annotations.Test;

import com.api.baseservice.AuthService;
import com.api.model.request.SignupRequest;
import io.restassured.response.Response;

public class SignupTest {

	
	@Test(description="verify the signup test")
	public void SignupTests() {
		// TODO Auto-generated method stub
		SignupRequest signuprequest = new SignupRequest.builder()
				.Username("st5444")
				.password("st54444")
				.email("st54444@gmail.com")
				.firstname("st54444")
				.lastname("s2t5444").mobileNumber(9353)
				.build();
	     AuthService authservice = new AuthService();
	     Response response = authservice.signup(signuprequest);
	     System.out.println(response.asPrettyString());
	     
	 

	}
}


