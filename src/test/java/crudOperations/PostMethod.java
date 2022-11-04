package crudOperations;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic.utility.BaseClass;
import com.crm.generic.utility.EndPoints;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class PostMethod extends BaseClass {
	
	@Test
	
	public void postMethod()
	{
		baseURI ="http://localhost:8080";
		
		JSONObject object=new JSONObject();
		
		object.put( "dateTime","2022-10-30T06:26:01.775Z");
		object.put("id",21);
		
		JSONObject object1=new JSONObject();
		object1.put("cost","30000");
		object1.put("description","dog");
		object1.put("id", 4);
		object1.put("name","sanket");
		
		object.put("status","ok");
		object.put("totalCost",30000);
		
		JSONObject object2=new JSONObject();
		object2.put("address","satara");	
		object2.put("email","aarti@gmail.com");
		object2.put("id",5);
		object2.put("name","aarti");
		object2.put("otp",1493);
		object2.put("password","aarti123");
		object2.put("phone",1234568891);
		object2.put("username","aarti");
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		.body(object1)
		.body(object2)
		.when()
		.post(EndPoints.create)
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
	
	}

	
}
