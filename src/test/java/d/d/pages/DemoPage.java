package d.d.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class DemoPage extends PageObject {

	public void clickOnSomething() {
		WebElement elem = getDriver().findElement(By.cssSelector(""));
		element(elem).waitUntilVisible();
		elem.click();
	}

}