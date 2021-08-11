package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class RestAssuredframe {

	
	
	
	@BeforeClass
	public static void setUpTestEnv() {
		
		RestAssured.baseURI="http://localhost:4444/onlineshop";
		
	}
	
	@Test
	public void testSayHello() {
		
		Response response=RestAssured.get("/sayHello");
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asString());
		
		String expectedResponse="Hello world from RestFulService";
		String actualresponse=response.getBody().asString();
	Assert.assertEquals(expectedResponse, actualresponse);
	
	
	
	}
	
	
	
	
}
