package crudOperations;

import org.testng.annotations.Test;

import com.crm.generic.utility.BaseClass;


import static io.restassured.RestAssured.*;

public class DeleteOrder extends BaseClass {
	
	@Test
	
	public void deleteOrder() {
		baseURI="http://localhost:8080";
		
		when()
		.delete("/productorders/16")
		
		.then()
		.assertThat().statusCode(500)
		.log().all();
	
	}

}
