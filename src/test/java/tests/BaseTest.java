package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utils.TestUtils;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utils.ApiUtils;

public class BaseTest {
	public Response res = null; // Response
	public JsonPath jp = null; // JsonPath

	// Instantiate a Helper Test Methods (testUtils) Object
	TestUtils testUtils = new TestUtils();

	@BeforeClass
	public void setup() {
		// Test Setup
		ApiUtils.setBaseURI(); // Setup Base URI
		ApiUtils.setBasePath("api"); // Setup Base Path
		ApiUtils.setContentType(ContentType.JSON); // Setup Content Type
	}

	@AfterClass
	public void afterTest() {
		// Reset Values
		ApiUtils.resetBaseURI();
		ApiUtils.resetBasePath();
	}
}
