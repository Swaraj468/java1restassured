package Demo;

import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
;
public class demojson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response response = given().auth().basic("admin", "admin")
				.contentType(ContentType.JSON).get("http://localhost:3000/demo");
		response.prettyPrint();
		
	}

}

