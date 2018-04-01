package d.ui.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import d.ui.scenarios.DemoTestScenarios;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class UI_Test {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public DemoTestScenarios demoScenarios;

	@Test
	public void ui_test() {
		demoScenarios.demoScenario();
	}

}