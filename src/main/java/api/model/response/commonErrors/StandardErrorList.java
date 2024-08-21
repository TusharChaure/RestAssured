package api.model.response.commonErrors;

public class StandardErrorList {
	
	private String message;
	private ErrorList error;
	private Integer status_code;
	
	public StandardErrorList() {}
	
	public StandardErrorList(String message, ErrorList error, Integer status_code) {
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

	public ErrorList getError() {
		return error;
	}

	public void setError(ErrorList error) {
		this.error = error;
	}

	public Integer getStatus_code() {
		return status_code;
	}

	public void setStatus_code(Integer status_code) {
		this.status_code = status_code;
	}

}
