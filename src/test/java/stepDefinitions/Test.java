package stepDefinitions;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class Test {

	private static RequestSpecBuilder builder;
	private static RequestSpecification request;
	private static ResponseOptions<Response> response;
	private static Object object;
	
	public static RequestSpecification setRequest() {
		builder = new RequestSpecBuilder();
		builder.setBaseUri("");
		builder.setBasePath("");
		builder.addHeader("", "");
		return builder.build();
	}
	
	public static RequestSpecification createRequest() {
		return RestAssured.given(setRequest()).when().relaxedHTTPSValidation().log().all();
	}
	
	public static ResponseOptions<Response> postRequest(Object body ,String endpoint) {
		request = createRequest();
		return request.body(body).post(endpoint);
	}
	
	public static ResponseOptions<Response> getRequest(String params , String endpoint) {
		request = createRequest();
		return request.get(endpoint, params);
	}
	
	public static ResponseOptions<Response> putRequest(Object body , String endpoint) {
		request = createRequest();
		return request.body(body).put(endpoint);
	}
	
	public static ResponseOptions<Response> deleteRequest(String params , String endpoint) {
		request = createRequest();
		return request.delete(endpoint, params);	
	}
	
	public static void main(String[] args) {
		String str = "post";
		switch(str) {
			case "post": response = postRequest(object, ""); break;
			case "get": response = getRequest("", ""); break;
			case "put": response = putRequest("", ""); break;
			case "delete": response = deleteRequest("", ""); break;
		}	
	}
}
