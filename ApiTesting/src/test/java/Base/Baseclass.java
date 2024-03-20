package Base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseclass {
	public static String base_Url = "http://simple-grocery-store-api.online/";
	public static String get_Url = base_Url + ": /products/{productId}";
	public static String post_Url = base_Url + "/carts";

	public static RequestSpecification httpRequest;
	public static Response response;
	public static String productId = "4641";
	public static String cartId = "iH4UmGBaQWXFoEKTrbdGC";

}
