package api.model.requests;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginRequest {

	public String username;
    public String password;
	
    public LoginRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}
    
}
