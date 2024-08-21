package api.model.response.login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import api.model.response.commonResponse.CommonResponse;

public class Response extends CommonResponse {

	private Payload payload;
	
	public Response() {}
	
	@JsonCreator
	public Response(@JsonProperty(value="message", required=true) String message, @JsonProperty(value="payload", required=true) Payload payload, @JsonProperty(value="status_code", required=true) Integer status_code) {
		this.message = message;
		this.payload = payload;
		this.status_code = status_code;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	public String getMessage() {
		return message;
	}
 
	public void setMessage(String message) {
		this.message = message;
	}
 
	public Integer getStatus_code() {
		return status_code;
	}
 
	public void setStatus_code(Integer status_code) {
		this.status_code = status_code;
	}
	
}