package api.model.response.commonErrors;

public class ErrorList {
	
	protected String incident_type_name;
	protected String created_for_account;
	protected String rsn;
	protected String created_by_account;
	protected String data_view_type;
	protected String incident_ts_gte;
	protected String incident_ts_lte;
	
	public ErrorList() {}
	
	public ErrorList(String incident_type_name, String created_for_account, String rsn, String created_by_account, String data_view_type, String incident_ts_gte, String incident_ts_lte) {
		this.incident_type_name = incident_type_name;
		this.created_for_account = created_for_account;
		this.rsn = rsn;
		this.created_by_account = created_by_account;
		this.data_view_type = data_view_type;
		this.incident_ts_gte = incident_ts_gte;
		this.incident_ts_lte = incident_ts_lte;
	}

	public String getIncident_type_name() {
		return incident_type_name;
	}

	public void setIncident_type_name(String incident_type_name) {
		this.incident_type_name = incident_type_name;
	}

	public String getCreated_for_account() {
		return created_for_account;
	}

	public void setCreated_for_account(String created_for_account) {
		this.created_for_account = created_for_account;
	}

	public String getRsn() {
		return rsn;
	}

	public void setRsn(String rsn) {
		this.rsn = rsn;
	}

	public String getCreated_by_account() {
		return created_by_account;
	}

	public void setCreated_by_account(String created_by_account) {
		this.created_by_account = created_by_account;
	}

	public String getData_view_type() {
		return data_view_type;
	}

	public void setData_view_type(String data_view_type) {
		this.data_view_type = data_view_type;
	}

	public String getIncident_ts_gte() {
		return incident_ts_gte;
	}

	public void setIncident_ts_gte(String incident_ts_gte) {
		this.incident_ts_gte = incident_ts_gte;
	}

	public String getIncident_ts_lte() {
		return incident_ts_lte;
	}

	public void setIncident_ts_lte(String incident_ts_lte) {
		this.incident_ts_lte = incident_ts_lte;
	}
		
}
