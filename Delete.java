package Demo;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		given().contentType(ContentType.JSON).delete("http://localhost:3000/demo/10");

	}

}
