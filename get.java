package Demo;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class get {
	
	
	
	public static void main(String[] args) {
	
	
	Response response = given().auth().basic("admin", "admin")
			.contentType(ContentType.JSON)
			.get("http://localhost:3000/student");
	response.prettyPrint();
	

}

}