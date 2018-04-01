package d.ui.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;

public class DemoPage extends BasePage {

	public void clickOnSomething() {
		getDriver().get("https://www.google.com/");
		WebElement elem = getDriver().findElement(By.cssSelector(""));
		element(elem).waitUntilVisible();
		elem.click();
	}

}