package api.model.response.login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import api.model.response.commonResponse.EmptyMeta;

public class LoginSuccessResponse{
	
	private Response response;	
	private EmptyMeta meta;
	
	public LoginSuccessResponse() {}
	
	@JsonCreator
	public LoginSuccessResponse(@JsonProperty(value="response", required=true) Response response, @JsonProperty(value="meta",required=true) EmptyMeta meta) {
		this.response = response;
		this.meta = meta;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public EmptyMeta getMeta() {
		return meta;
	}

	public void setMeta(EmptyMeta meta) {
		this.meta = meta;
	}	
	
}