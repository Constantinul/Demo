package d.d.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import d.d.steps.serenity.DemoSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class UI_Test {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public DemoSteps demoSteps;

	@Test
	public void ui_test() {
		demoSteps.clickOnSomething();
	}

}