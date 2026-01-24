package com.api.baseservice;

import com.api.model.request.LoginRequest;
import com.api.model.request.ProfileRequestPOJO;

import io.restassured.response.Response;

public class UsermanagementService extends BaseService{
	
	private static final String BASE_PATH="/api/users/";
	
		public Response getprofile(String token) {
			setReponsetoken(token);
			return getRequest(BASE_PATH+"profile");
		
		}
		
		public Response updateprofile(String token, ProfileRequestPOJO Payload) {
			setReponsetoken(token);
			return PutRequest(Payload,BASE_PATH+"profile");
		
		}
}
	
