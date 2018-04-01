package d.api.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import d.api.steps.Api1Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class API_Test {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public Api1Steps api1Steps;

	@Test
	public void api_test() {
		// api1Steps.call1_get();
		api1Steps.call2_post();
	}

}