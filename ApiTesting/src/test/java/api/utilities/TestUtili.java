package api.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class TestUtili {

	public static String EmailID() {
		String genrateString = RandomStringUtils.randomAlphabetic(1);
		return ("Girish" + genrateString + "@example.com");

	}

}
