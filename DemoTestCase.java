package Demo;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;




public class DemoTestCase {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response response = given().auth().basic("admin", "admin")
		.contentType(ContentType.JSON)
		.get("http://localhost:3000/student");
		response.prettyPrint();

	}

}
