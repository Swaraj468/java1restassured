package Demo;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
 
public class put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = given().contentType(ContentType.JSON)
				.body("  {\r\n"
					+ "        \"id\": \"6\",\r\n"
						+ "        \"username\": \"Akanksha\",\r\n"
						+ "        \"phoneNo\": \"+91-7367085354\",\r\n"
						+ "        \"age\": 22,\r\n"
						+ "        \"isSubscriber\": false,\r\n"
						+ "        \"profile\": {\r\n"
						+ "            \"email\": \"akanksha0000@gmail.com\",\r\n"
						+ "            \"Name\": \"Akanksha\"\r\n"
						+ "        },\r\n"
						+ "        \"hobbies\": [\r\n"
						+ "            \"football\",\r\n"
						+ "            \"Swimming\",\r\n"
						+ "            \"gym\"\r\n"
						+ "        ]\r\n"
						+ "    }").put("http://localhost:3000/demo/6");
		
		response.prettyPrint();

	}

}
