package d.ui.steps;

import d.ui.pages.BasePage;
import net.thucydides.core.annotations.Step;

public class BaseSteps {

	public BasePage basePage;

	// in case some basePage methods need to be called here

	@Step(callNestedMethods = false)
	public void switchToTab(int pos) {
		basePage.switchToTab(pos);
	}

}
