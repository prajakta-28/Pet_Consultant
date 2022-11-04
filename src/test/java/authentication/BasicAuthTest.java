package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BasicAuthTest {
	@Test

	public static void main(String[] args) {
		baseURI ="https://github.com";
		
	  given().auth().basic("prajakta-28", "praj1234@")
	   .contentType(ContentType.JSON)
	   .when().get("/login")
	   .then().log().all();
	
		
	}

}
