package d.ui.steps;

import d.ui.pages.DemoPage;
import net.thucydides.core.annotations.Step;

public class DemoSteps extends BaseSteps {

	DemoPage demoPage;

	@Step
	public void clickOnSomething() {
		demoPage.clickOnSomething();
	}

}