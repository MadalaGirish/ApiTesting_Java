package api.test;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.Baseclass;
import api.utilities.TestUtili;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllOrdersBearer {
	String email = TestUtili.EmailID();

	@Test
	public void getdata() {

		RestAssured.baseURI = Baseclass.base_Url;

		RequestSpecification http = RestAssured.given();
		JSONObject request = new JSONObject();
		request.put("clientName", "Girish1233");
		request.put("clientEmail", email);
		http.header("content-type", "application/json; charset=utf-8");
		http.body(request.toString());
		Response response = http.request(Method.POST, "/api-clients");
		String res = response.getBody().asString();
		System.out.println("Response Body:" + res);
		JsonPath jsonevaluator = response.jsonPath();
		String token = jsonevaluator.get("accessToken");
		System.out.println("Response Token printed:" + token);

		// validation
		int status = response.getStatusCode();
		System.out.println("Status Code value: " + status);
		Assert.assertEquals(status, 201);
		String statusline = response.getStatusLine();
		System.out.println("Status Line: " + statusline);

		String server = response.header("Server");
		System.out.println("Server Lien: " + server);
		Assert.assertEquals(server, "Fly/0052f39f (2024-03-18)");

	}

}
