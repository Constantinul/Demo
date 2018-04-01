package d.d.steps.serenity;

import d.d.pages.DemoPage;
import net.thucydides.core.annotations.Step;

public class DemoSteps {

	DemoPage demoPage;

	@Step
	public void clickOnSomething() {
		demoPage.clickOnSomething();
	}

}