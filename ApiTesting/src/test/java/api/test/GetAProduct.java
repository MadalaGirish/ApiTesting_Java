package api.test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.Baseclass;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class GetAProduct extends Baseclass {
	@BeforeClass
	public void getProduct() throws InterruptedException {
		RestAssured.baseURI = Baseclass.base_Url;
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/products/" + "4643");
		Thread.sleep(2000);

	}

	@Test
	public void respose() {
		String responseBody = response.getBody().asString();
		Assert.assertTrue(responseBody != null);
		System.out.println(responseBody);

	}

	@Test
	public void StatusCode() {
		int status = response.getStatusCode();
		Assert.assertEquals(status, 200);
		System.out.println("Valid Status Code:" + status);

	}

	@Test
	public void CheckResponseTime() {
		long responseTime = response.getTime();
		System.out.println("Response Time:" + responseTime);
		if (responseTime > 2000)
			System.out.println("Response Time is greater then 1000:" + responseTime);

		Assert.assertTrue(responseTime < 2000);

	}

	@Test
	public void CheckContent() {
		String contenttype = response.header("content-type");
		System.out.println("Content Type:" + contenttype);
		Assert.assertEquals(contenttype, "application/json; charset=utf-8");

	}

	@AfterClass
	public void tearDown() {
		System.out.println("***********Test Case Finished*************");

	}

}
