package api.model.response.commonErrors;

public class StandardError {
	
	private String message;
	private String error;
	private Integer status_code;
	
	public StandardError() {}
	
	public StandardError(String message, String error, Integer status_code) {
		this.message = message;
		this.error = error;
		this.status_code = status_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getStatus_code() {
		return status_code;
	}

	public void setStatus_code(Integer status_code) {
		this.status_code = status_code;
	}

}
