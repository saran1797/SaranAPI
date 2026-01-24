package com.api.tests;

import org.testng.annotations.Test;

import com.api.baseservice.AuthService;
import com.api.model.request.LoginRequest;

import io.restassured.response.Response;

public class ForgotPasswordTest {

	@Test(description="verify the Forgotpassword  test")
	public void forgotpasswordtest() {
		// TODO Auto-generated method stub
	     AuthService authservice = new AuthService();
	     Response response = authservice.forgotpassword("saran123@gmail.com");
	     System.out.println(response.asPrettyString());
}

}