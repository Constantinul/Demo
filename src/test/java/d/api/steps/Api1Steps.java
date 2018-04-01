package d.api.steps;

import static net.serenitybdd.rest.SerenityRest.given;

import d.ui.utils.FileUtils;
import io.restassured.path.json.JsonPath;
import net.thucydides.core.annotations.Step;

public class Api1Steps {

	@Step
	public void call1_get() {
		JsonPath response = given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().extract().body()
				.jsonPath();
		System.out.println(response.prettify());

		// String sessionId = SerenityRest.getDefaultSessionId();
		// SerenityRest.setDefaultSessionId(sessionId);
	}

	@Step
	public void call2_post() {
		String body = FileUtils.readFromFile("src/test/resources/api/json");
		// Gson gson = new Gson();
		// System.out.println(gson.toJson(body));
		JsonPath response = given().contentType("application/json").body(body).when()
				.post("https://jsonplaceholder.typicode.com/posts").then().extract().body().jsonPath();
		System.out.println(response.get("title").toString());
	}

}
