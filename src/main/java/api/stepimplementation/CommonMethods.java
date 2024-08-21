package api.stepimplementation;

import api.constants.Endpoints;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class CommonMethods{
	
	private static ResponseOptions<Response> response;
	public static RequestSpecification request;
	HelperClass helper = new HelperClass();

	public ResponseOptions<Response> executeWithPOSTMethod(String token, Object requestBody)
	{
		request = helper.createReq(token);
		response = request.body(requestBody).post(Endpoints.endpointPath);			
		return response;
	}
	
}
