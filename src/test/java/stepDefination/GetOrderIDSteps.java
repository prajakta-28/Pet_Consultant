package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetOrderIDSteps {
	Response res;
	ValidatableResponse validate;
	
	@When("User is able to retrive the data by id using an api is {string}")
	public void user_is_able_to_retrive_the_data_by_id_using_an_api_is(String url) {
		 res = RestAssured.get(url);
	}

	@Then("User validates id the status code is {int}")
	public void user_validates_id_the_status_code_is(Integer code) {
		ValidatableResponse validate = res.then();
		validate.assertThat().statusCode(code).log().all();
	}

}
