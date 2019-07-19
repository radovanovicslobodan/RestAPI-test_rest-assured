package utils;

import org.testng.annotations.Test;
import io.restassured.*;

public class TestClass {
	@Test
	public void tc01() {
		RestAssured.baseURI = "abc";
	}
}
