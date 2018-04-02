package d.ui.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;

public class DemoPage extends BasePage {

	public void navigateToPage() {
		getDriver().get("https://www.google.com/");
	}

	public void clickOnImFeelingLucky() {
		WebElement elem = getDriver().findElement(By.cssSelector("input[value=\"I'm Feeling Lucky\"]"));
		element(elem).waitUntilVisible();
		elem.click();
		waitABit(3000);
	}

}