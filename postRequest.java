package Demo;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "10");
		map.put("S_rollmo.", "21");
		map.put("username", "Ruhi");
		map.put("age", "22");
		Response response =given().contentType(ContentType.JSON)
//
//	.body("  {\r\n"
//			+ "        \"id\": \"6\",\r\n"
//			+ "        \"username\": \"Akanksha\",\r\n"
//			+ "        \"phoneNo\": \"+91-8235107591\",\r\n"
//			+ "        \"age\": 22,\r\n"
//			+ "        \"isSubscriber\": true,\r\n"
//			+ "        \"profile\": {\r\n"
//			+ "            \"email\": \"akanksha0000@gmail.com\",\r\n"
//			+ "            \"Name\": \"Akanksha\"\r\n"
//			+ "        },\r\n"
//			+ "        \"hobbies\": [\r\n"
//			+ "            \"football\",\r\n"
//			+ "            \"Swimming\",\r\n"
//			+ "            \"gym\"\r\n"
//			+ "        ]\r\n"
//			+ "    }")
				.body(map)
				.post("http://localhost:3000/demo");
		response.prettyPrint();
	

	}

}
