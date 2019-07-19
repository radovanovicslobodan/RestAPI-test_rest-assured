package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ApiUtils {
	// Global Setup Variables
	public static String path;
	public static String jsonPathTerm;

	// Sets Base URI
	public static void setBaseURI() {
		RestAssured.baseURI = "http://generator.swagger.io/";
	}

	// Sets base path
	public static void setBasePath(String basePathTerm) {
		RestAssured.basePath = basePathTerm;
	}

	// Reset Base URI (after test)
	public static void resetBaseURI() {
		RestAssured.baseURI = null;
	}

	// Reset base path
	public static void resetBasePath() {
		RestAssured.basePath = null;
	}

	// Sets ContentType
	public static void setContentType(ContentType Type) {
		RestAssured.given().contentType(Type);
	}

	// Returns response by given path
	public static Response getResponsebyPath(String path) {
		return RestAssured.get(path);
	}

	// Returns response
	public static Response getResponse() {
		return RestAssured.get();
	}

	// Returns JsonPath object
	public static JsonPath getJsonPath(Response res) {
		String json = res.asString();
		// System.out.print("returned json: " + json +"\n");
		return new JsonPath(json);
	}
}
