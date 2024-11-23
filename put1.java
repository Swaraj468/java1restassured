package Demo;


import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class put1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = given().contentType(ContentType.JSON)
				.body("{\r\n"
						+ "      \"id\": \"2\",\r\n"
						+ "      \"name\": \"adarsh\",\r\n"
						+ "      \"roll no\": \"20\"\r\n"
						+ "    }")
				.put("http://localhost:3000/students/2");
		response.prettyPrint();

	}

}
