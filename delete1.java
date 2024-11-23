package Demo;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
public class delete1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		given().contentType(ContentType.JSON).delete("http://localhost:3000/students/8eb1");

	}

}
