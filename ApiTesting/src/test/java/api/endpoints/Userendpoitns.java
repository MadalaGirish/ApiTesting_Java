package api.endpoints;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class Userendpoitns {

	public static Response GetAllProducts(int productid) {
		Response response = given().pathParam("productId", productid).when().get(Urls.get_Url);

		return response;

	}

}
