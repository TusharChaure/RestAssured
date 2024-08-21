package api.model.response.login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Payload {

	private String token;
	private String user_id;
	private String language;
	private String account_number;
	private String account_type;
	private Boolean mobile_verified;
	private Boolean email_verified;
	private Boolean details_updated;
	
	public Payload() {}

	@JsonCreator
	public Payload(@JsonProperty(value="token",required=true)String token, @JsonProperty(value="user_id",required=true) String user_id, @JsonProperty(value="language",required=true)String language,@JsonProperty(value="account_number",required=true) String account_number,@JsonProperty(value="account_type",required=true)String account_type, @JsonProperty(value="mobile_verified",required=true)Boolean mobile_verified,@JsonProperty(value="email_verified",required=true) Boolean email_verified,@JsonProperty(value="details_updated",required=true) Boolean details_updated) {
		this.token = token;
		this.user_id = user_id;
		this.language = language;
		this.account_number = account_number;
		this.account_type = account_type;
		this.mobile_verified = mobile_verified;
		this.email_verified = email_verified;
		this.details_updated = details_updated;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Boolean getMobile_verified() {
		return mobile_verified;
	}

	public void setMobile_verified(Boolean mobile_verified) {
		this.mobile_verified = mobile_verified;
	}

	public Boolean getEmail_verified() {
		return email_verified;
	}

	public void setEmail_verified(Boolean email_verified) {
		this.email_verified = email_verified;
	}

	public Boolean getDetails_updated() {
		return details_updated;
	}

	public void setDetails_updated(Boolean details_updated) {
		this.details_updated = details_updated;
	}
	
}