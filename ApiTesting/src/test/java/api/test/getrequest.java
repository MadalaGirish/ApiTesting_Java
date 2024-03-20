package api.test;

import org.json.JSONObject;
import org.testng.annotations.Test;

import Base.Baseclass;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getrequest {

//	@Test
//	public void getdata() {
//
//		RestAssured.baseURI = Urls.base_Url;
//
//		RequestSpecification http = RestAssured.given();
//		Response response = http.request(Method.GET, "/products");
//		String res = response.getBody().asString();
//		System.out.println("Response Body:" + res);
//
//		// validation
//		int status = response.getStatusCode();
//		System.out.println("Status Code value: " + status);
//		Assert.assertEquals(status, 200);
//		String statusline = response.getStatusLine();
//		System.out.println("Status Line: " + statusline);
//
//	}

	@Test
	public void postReq() {

		RestAssured.baseURI = Baseclass.base_Url;

		RequestSpecification http = RestAssured.given();
		JSONObject request = new JSONObject();
		request.put("created", "true");
		request.put("created", "xxxxxxxxxxx");

		http.header("content-type", "application/json; charset=utf-8");
		http.body(request.toString());
		Response response = http.request(Method.POST, "/carts");

		int status = response.getStatusCode();
		String res = response.getBody().asString();
		System.out.println("Response Body:" + res);

//		System.out.println("Status Code value: " + status);

//		Response response = http.request(Method.POST, "/carts");
//		String res = response.getBody().asString();
//		System.out.println("Response Body:" + res);
//
//		// validation
//		int status = response.getStatusCode();
//		System.out.println("Status Code value: " + status);
//		Assert.assertEquals(status, 200);
//		String statusline = response.getStatusLine();
//		System.out.println("Status Line: " + statusline);

	}
}
