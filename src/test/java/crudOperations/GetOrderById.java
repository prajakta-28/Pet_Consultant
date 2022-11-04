package crudOperations;

import org.testng.annotations.Test;

import com.crm.generic.utility.BaseClass;
import com.crm.generic.utility.EndPoints;

import static io.restassured.RestAssured.*;

public class GetOrderById extends BaseClass{
	
	@Test
	
	public void getMethod ()
	{
		baseURI ="http://localhost:8080";
		
		when()
		.get(EndPoints.create1)
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

	

}
