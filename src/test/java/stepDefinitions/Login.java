package stepDefinitions;

import api.model.requests.LoginRequest;
import api.utils.readConfigFile;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	@Before
	public void beforeStepImpl(Scenario scenario) {
		BaseClass.scenario = scenario;
	}
	
	@Given("Create request body with valid username and password field")
	public void createQueryParameterListForNegativeGetIncidentTypeRequest() {
		object = new LoginRequest(username, password);
	}
	
	@When("Get login request response")
	public void getLoginRequestResponse() {
		res = commonMethods.executeWithPOSTMethod(null, object);
	}
	
	@Then("Verify status code {int} from response body")
	public void getLoginRequestResponse(Integer statusCode) {
		verifyAssertEquality("Incorrect status code", statusCode, res.getStatusCode());
	}
	
	@Then("Collect token from response body")
	public void collectTokenFromResponseBody() {
		token = res.getBody().jsonPath().getString("token");
	}
}
