package authentication;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic.utility.BaseClass;

import static io.restassured.RestAssured.*;

import java.security.PublicKey;

import io.restassured.http.ContentType;

public class BarearTokenTest extends BaseClass{
	
	@Test
	public void barearTokenTest() {
	
		baseURI ="https://api.github.com";
		
		JSONObject object=new JSONObject();
		object.put("name", "Pet_Consultant");
		
		given().auth().oauth2("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")
		.body(object).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
			
		
	}
	}

