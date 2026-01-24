package com.api.baseservice;

import java.util.HashMap;

import com.api.model.request.LoginRequest;
import com.api.model.request.SignupRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	private static final String BASE_PATH="/api/auth/";
	
	public Response login(LoginRequest Payload) {
		return PostRequest(Payload, BASE_PATH+"login");
	
	}

	public Response signup(SignupRequest payload) {
		// TODO Auto-generated method stub
		return PostRequest(payload, BASE_PATH+"signup");
	}
	
	public Response forgotpassword(String emailaddress) {
		// TODO Auto-generated method stub
		HashMap<String, String> payload = new HashMap<>();
		payload.put("email", emailaddress);
		return PostRequest(payload, BASE_PATH+"forgot-password");
	}
	

}
