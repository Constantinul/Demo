package d.d.scenarios;

import net.thucydides.core.annotations.StepGroup;

public class DemoTestScenarios extends BaseScenarios {

	@StepGroup
	public void demoScenario() {
		demoSteps.clickOnSomething();
	}

}
