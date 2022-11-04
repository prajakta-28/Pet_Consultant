package crudOperations;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic.utility.BaseClass;
import com.crm.generic.utility.EndPoints;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class PutMethod extends BaseClass {
	
	@Test
	
	public void putMethod()
	{
		baseURI ="http://localhost:8080";
		
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
	
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		.when()
		.put(EndPoints.create)
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

	
}
