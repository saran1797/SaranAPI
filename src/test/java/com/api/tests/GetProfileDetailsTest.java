package com.api.tests;

import org.testng.annotations.Test;

import com.api.baseservice.AuthService;
import com.api.baseservice.UsermanagementService;
import com.api.model.request.LoginRequest;
import com.api.model.request.ProfileRequestPOJO;
import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileDetailsTest {

	@Test(description="verify the getProfile  test")
		public void getprofiletest() {
			// TODO Auto-generated method stub
		
		//-------login----
			AuthService authservice = new AuthService();
			Response response = authservice.login(new LoginRequest("saran123456", "saran123"));
		    LoginResponse loginresponse = response.as(LoginResponse.class);
		    System.out.println(loginresponse.getToken());
		     
	 //----getting the token and getting the sample username-----	    
			UsermanagementService usermanagement = new UsermanagementService();
			response = usermanagement.getprofile(loginresponse.getToken());
			UserProfileResponse userprofileresponse = response.as(UserProfileResponse.class);
			System.out.println(userprofileresponse.getUsername());
			
	//using profilePOJO building the put details		
			ProfileRequestPOJO profileRequestPOJO = new ProfileRequestPOJO.Builder()
					.firstName("saran7094940456")
					.lastName("spssss")
					.mobileNumber("7094934433").build();
		    
			response = usermanagement.updateprofile(loginresponse.getToken(), profileRequestPOJO);
 /// seeing the reponse			
			System.out.println(response.asPrettyString());
			
			
	}
}
