package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilters implements Filter {
 
	private static final Logger Logger = (org.apache.logging.log4j.core.Logger) LogManager.getLogger(LoggingFilters.class);
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		// TODO Auto-generated method stub
		logrequest(requestSpec);
		Response response = ctx.next(requestSpec, responseSpec); //request is going to execute
		logresponse(response);
		return response; //test for assertion
	}

	private void logrequest(FilterableRequestSpecification requestSpec) {
		Logger.info("BASE URI:" + requestSpec.getBaseUri());
		Logger.info("REQUEST HEADER:" + requestSpec.getHeaders());
		Logger.info("BODY:" + requestSpec.getBody());
		
		
	}
	
	private void logresponse(Response response) {
		// TODO Auto-generated method stub
		Logger.info("STATUS CODE:" + response.getStatusCode());
		Logger.info("RESPONSE BODY:" + response.getBody().prettyPrint());
		Logger.info("RESPONSE HEADER:" + response.headers());
	}
	

}
