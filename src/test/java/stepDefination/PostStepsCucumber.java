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

public class PostStepsCucumber {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;

@Given("User want to post the data in database")
public void user_want_to_post_the_data_in_databse() {
	JSONObject object = new JSONObject();
	object.put( "dateTime","2022-11-02T10:10:11.752Z");
	object.put("id",11);
	
	object.put("cost","20000");
	object.put("description","cat");
	object.put("id", 2);
	object.put("name","shra");
	
	object.put("status","ok");
	object.put("totalCost",20000);
	
	object.put("address","mumbai");
	object.put("email","rashmi@gmail.com");
	object.put("id",3);
	object.put("name","rashmi");
	object.put("otp",9955);
	object.put("password","rashmi123");
	object.put("phone",1234567891);
	object.put("username","rashmi");
	
	 req = RestAssured.given();
	 req.body(object);
	 req.contentType(ContentType.JSON);
	 
}
    

   @When("User is able to post the data by using an api is {string}")
       public void user_is_able_to_post_the_data_by_using_an_api_is(String URI) {
   
         res = req.post(URI);
}

    @Then("User validates the status code is {int}")
        public void user_validates_the_status_code_is(Integer code) {
	     validate = res.then();
	     validate.assertThat().statusCode(code).log().all();
	
    
}

}
