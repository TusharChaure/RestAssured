package api.stepimplementation;

import api.helpers.CustomLogFilter;
import api.utils.readConfigFile;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


public class HelperClass implements readConfigFile{

	protected static RequestSpecification request;
	protected static RequestSpecification get_request;
	protected static RequestSpecBuilder builder;
	private static Filter logFilter;

	public static RequestSpecification setRequestSpec(String token)
	{	
		builder=new RequestSpecBuilder();
		builder.setBaseUri(baseURL);
		builder.setBasePath(basePath);
		builder.setContentType(ContentType.JSON);
		builder.setAccept(ContentType.ANY);
		if(token!=null)
			builder.addHeader("Authorization", token);
		logFilter=new CustomLogFilter();
		return builder.build();
	}

	public  RequestSpecification createReq(String token)
	{		
		return RestAssured.given(setRequestSpec(token)).filter(logFilter).relaxedHTTPSValidation().log().all();
	}

	public String writeLogtoReport()
	{
		CustomLogFilter customLogFilter = (CustomLogFilter)logFilter;	       
		return  "\n" + "API Request: " + customLogFilter.getRequestBuilder()
		+ "\n" + "API Response: " + customLogFilter.getResponseBuilder();
	}

}
