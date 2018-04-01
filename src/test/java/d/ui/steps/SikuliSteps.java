package d.ui.steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

public class SikuliSteps extends BaseSteps {

	@Step(callNestedMethods = false)
	public void verifyImageIsPresent(String filePath) {
		Assert.assertTrue("screenshot " + filePath + " was NOT present on the screen",
				basePage.verifyImageIsPresent(filePath));
	}

	@Step(callNestedMethods = false)
	public void verifyImageIsPresent(String filePath, double similarity) {
		Assert.assertTrue("screenshot " + filePath + " was NOT present on the screen",
				basePage.verifyImageIsPresent(filePath, similarity));
	}

	@Step(callNestedMethods = false)
	public void verifyImageIsNotPresent(String filePath) {
		Assert.assertFalse("screenshot " + filePath + " WAS present on the screen",
				basePage.verifyImageIsPresent(filePath));
	}

	@Step(callNestedMethods = false)
	public boolean isImagePresentOnScreen(String filePath) {
		return basePage.verifyImageIsPresent(filePath);
	}

	@Step(callNestedMethods = false)
	public void testSikuli(String fileName) {
		basePage.testSikuli(fileName);
	}

}
