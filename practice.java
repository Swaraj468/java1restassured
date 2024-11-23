package Demo;


import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response response = given().auth().basic("admin", "admin")
				.contentType(ContentType.JSON)
				.queryParams("id", 6)
				.get("http://localhost:3000/demo");
				response.prettyPrint();

	}

}

