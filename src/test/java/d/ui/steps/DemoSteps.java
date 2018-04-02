package d.ui.steps;

import d.ui.pages.DemoPage;
import net.thucydides.core.annotations.Step;

public class DemoSteps {

	DemoPage demoPage;

	@Step
	public void navigateToPage() {
		demoPage.navigateToPage();
	}

	@Step
	public void clickOnImFeelingLucky() {
		demoPage.clickOnImFeelingLucky();
	}

}