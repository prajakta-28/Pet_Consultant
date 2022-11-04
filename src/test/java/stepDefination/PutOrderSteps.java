package stepDefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutOrderSteps {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;

	@Given("User want to update the data in database")
	public void user_want_to_update_the_data_in_database() {
		JSONObject object=new JSONObject();
		object.put( "dateTime","2022-10-30T06:26:01.775Z");
		object.put("id",9);
		
		object.put("cost","20000");
		object.put("description","cat");
		object.put("id", 2);
		object.put("name","shra");
		object.put("status","ok");
		object.put("totalCost",20000);
		
		object.put("address","satara");
		object.put("email","aarti@gmail.com");
		object.put("id",5);
		object.put("name","aarti");
		object.put("otp",1493);
		object.put("password","8NQsN8qAh44SmB+/RgwSBg==");
		object.put("phone",1234568891);
		object.put("username","aarti");
		
		req = RestAssured.given();
		 req.body(object);
		 req.contentType(ContentType.JSON);
	  
	}

	@When("User is able to update the data by using an api is {string}")
	public void user_is_able_to_update_the_data_by_using_an_api_is(String URI) {
		 res = req.put(URI);
	  
	}

	@Then("User is validates the given status code is {int}")
	public void user_is_validates_the_given_status_code_is(Integer code) {
	 
		validate = res.then();
		validate.assertThat().statusCode(code).log().all();
	}

}
