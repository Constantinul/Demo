package d.d.pages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import d.d.utils.Constants;
import d.d.utils.FileUtils;
import d.d.utils.JavaScriptUtils;
import d.d.utils.SikuliUtils;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

	public boolean verifyImageIsPresent(String filePath) {
		boolean isPresent = false;
		int waitForImageToAppear = 0;
		// waits for max of 10 seconds for the screenshot to appear
		while (!isPresent && waitForImageToAppear < 2) {
			String temporaryScreenshotName = "screenshot-" + System.currentTimeMillis() + ".jpg";
			isPresent = SikuliUtils.compareScreenshotFiles(getScreenshot(temporaryScreenshotName),
					FileUtils.getTestFilesLocation() + filePath);
			waitABit(5000);
			waitForImageToAppear++;
			FileUtils.deleteFile(temporaryScreenshotName);
		}
		return isPresent;
	}

	public boolean verifyImageIsPresent(String filePath, double similarity) {
		boolean isPresent = false;
		int waitForImageToAppear = 0;
		// waits for max of 10 seconds minute for the screenshot to appear
		while (!isPresent && waitForImageToAppear < 2) {
			String temporaryScreenshotName = "screenshot-" + System.currentTimeMillis() + ".jpg";
			isPresent = SikuliUtils.compareScreenshotFiles(getScreenshot(temporaryScreenshotName),
					FileUtils.getTestFilesLocation() + filePath, similarity);
			waitABit(5000);
			waitForImageToAppear++;
			FileUtils.deleteFile(temporaryScreenshotName);
		}
		return isPresent;
	}

	public String getScreenshot(String filePath) {
		File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		File dest = new File(filePath);
		try {
			org.apache.commons.io.FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath;
	}

	public void testSikuli(String fileName) {
		boolean match = false;
		int waitForImageToAppear = 0;
		// waits for max of 10 seconds for the screenshot to appear
		while (!match && waitForImageToAppear < 2) {
			match = SikuliUtils.compareScreenshotFiles(FileUtils.getTestFilesLocation() + fileName,
					FileUtils.getTestFilesLocation() + fileName);
			waitABit(5000);
			waitForImageToAppear++;
		}
		Assert.assertTrue(match);
	}

	public void clickOnElement(String listCss, String elementName) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		boolean foundElement = false;
		for (WebElement e : list) {
			// System.out.println("aaaaaaa: " + e.getText());
			if (e.getText().equalsIgnoreCase(elementName)) {
				// element(e).waitUntilVisible();
				e.click();
				waitABit(Constants.DEFAULT_WAIT_TIME);
				foundElement = true;
				break;
			}
		}
		Assert.assertTrue("element " + elementName + " was not found", foundElement);
	}

	public void clickOnElement(List<WebElement> list, String elementName) {
		boolean foundElement = false;
		for (WebElement e : list) {
			// System.out.println("aaaaaaa: " + e.getText());
			if (e.getText().equalsIgnoreCase(elementName)) {
				element(e).waitUntilVisible();
				e.click();
				waitABit(Constants.DEFAULT_WAIT_TIME);
				foundElement = true;
				break;
			}
		}
		Assert.assertTrue("element " + elementName + " was not found", foundElement);
	}

	public void clickOnElement(List<WebElement> list, int pos) {
		list.get(pos).click();
		waitABit(Constants.DEFAULT_WAIT_TIME);
	}

	public void clickOnElementByPartialText(String listCss, String elementName) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		boolean foundElement = false;
		for (WebElement e : list) {
			if (e.getText().toLowerCase().contains(elementName.toLowerCase())) {
				element(e).waitUntilVisible();
				e.click();
				waitABit(Constants.DEFAULT_WAIT_TIME);
				foundElement = true;
				break;
			}
		}
		Assert.assertTrue("element " + elementName + " was not found", foundElement);
	}

	public void rightClickOnElementByPartialText(String listCss, String elementName) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		boolean foundElement = false;
		for (WebElement e : list) {
			if (e.getText().toLowerCase().contains(elementName.toLowerCase())) {
				element(e).waitUntilVisible();
				Actions actions = new Actions(getDriver());
				actions.contextClick(e);
				actions.build().perform();
				waitABit(Constants.DEFAULT_WAIT_TIME);
				foundElement = true;
				break;
			}
		}
		Assert.assertTrue("element " + elementName + " was not found", foundElement);
	}

	public WebElement getWebElement(String listCss, String elementName) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		boolean foundElement = false;
		for (WebElement e : list) {
			// System.out.println("aaa: " + e.getText());
			if (e.getText().contentEquals(elementName)) {
				foundElement = true;
				element(e).waitUntilVisible();
				return e;
			}
		}
		Assert.assertTrue("element " + elementName + " was not found", foundElement);
		return null;
	}

	public WebElement getWebElementByPartialText(String listCss, String elementName) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		boolean foundElement = false;
		for (WebElement e : list) {
			if (e.getText().contains(elementName)) {
				foundElement = true;
				element(e).waitUntilVisible();
				return e;
			}
		}
		Assert.assertTrue("element " + elementName + " was not found", foundElement);
		return null;
	}

	public WebElement getWebElement(List<WebElement> list, String elementName) {
		boolean foundElement = false;
		for (WebElement e : list) {
			if (e.getText().contentEquals(elementName)) {
				foundElement = true;
				element(e).waitUntilVisible();
				return e;
			}
		}
		Assert.assertTrue("element " + elementName + " was not found", foundElement);
		return null;
	}

	public WebElement getWebElement(String listCss, int pos) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		return list.get(pos);
	}

	public WebElement getLastElementInList(String listCss) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		return list.get(list.size() - 1);
	}

	public WebElement getWebElementByAttributeValue(String listCss, String attribute, String attributeValue) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		for (WebElement e : list) {
			if (e.getAttribute(attribute).contentEquals(attributeValue)) {
				element(e).waitUntilVisible();
				return e;
			}
		}
		return null;
	}

	public WebElement getWebElementByPartialAttributeValue(String listCss, String attribute, String attributeValue) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		for (WebElement e : list) {
			if (e.getAttribute(attribute).contains(attributeValue)) {
				element(e).waitUntilVisible();
				return e;
			}
		}
		return null;
	}

	public void clickOnElement(String listCss, int pos) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		element(list.get(pos)).waitUntilVisible();
		list.get(pos).click();
		waitABit(Constants.DEFAULT_WAIT_TIME);
	}

	public void clickOnLastElementInList(String listCss) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		element(list.get(list.size() - 1)).waitUntilVisible();
		list.get(list.size() - 1).click();
		waitABit(Constants.DEFAULT_WAIT_TIME);
	}

	public void clickOnLastElementInList(String listCss, String elementName) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		List<WebElement> elementsList = new ArrayList<WebElement>();
		for (WebElement e : list) {
			if (e.getText().contains(elementName)) {
				elementsList.add(e);
			}
		}
		elementsList.get(elementsList.size() - 1).click();
		waitABit(Constants.DEFAULT_WAIT_TIME);
	}

	public void clickOnLastElementInList(WebElement elem, String listCss) {
		List<WebElement> list = elem.findElements(By.cssSelector(listCss));
		element(list.get(list.size() - 1)).waitUntilVisible();
		list.get(list.size() - 1).click();
		waitABit(Constants.DEFAULT_WAIT_TIME);
	}

	public void clickOnElementByAttribute(String listCss, String attribute, String attributeValue) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		for (WebElement e : list) {
			if (e.getAttribute(attribute).contentEquals(attributeValue)) {
				e.click();
				waitABit(Constants.DEFAULT_WAIT_TIME);
				break;
			}
		}
	}

	public boolean isElementPresentInList(String listCss, String elementText) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		for (WebElement e : list) {
			if (e.getText().contentEquals(elementText)) {
				return true;
			}
		}
		return false;
	}

	public boolean isElementPresentInList(List<WebElement> list, String elementText) {
		for (WebElement e : list) {
			if (e.getText().contentEquals(elementText)) {
				return true;
			}
		}
		return false;
	}

	public void verifyElementsArePresentInList(String listCss, String... strings) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		for (String s : strings) {
			boolean isPresent = false;
			for (WebElement e : list) {
				if (e.getText().contentEquals(s)) {
					isPresent = true;
					break;
				}
			}
			Assert.assertTrue("item: " + s + " was not present in list", isPresent);
		}
	}

	public boolean isElementPresentInListByPartialText(String listCss, String elementText) {
		List<WebElement> list = getDriver().findElements(By.cssSelector(listCss));
		for (WebElement e : list) {
			if (e.getText().contains(elementText)) {
				return true;
			}
		}
		return false;
	}

	public boolean isElementPresentInListByPartialText(List<WebElement> list, String elementText) {
		for (WebElement e : list) {
			if (e.getText().contains(elementText)) {
				return true;
			}
		}
		return false;
	}

	public boolean isElementPresent(String css) {
		getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		try {
			WebElement elem = getDriver().findElement(By.cssSelector(css));
			return elem.isDisplayed();
		} catch (Exception e) {
			return false;
		} finally {
			getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	@SuppressWarnings("unused")
	public boolean isChildOfElementPresent(WebElement element, String css) {
		try {
			WebElement elem = element.findElement(By.cssSelector(css));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void switchToTab(int pos) {
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(pos));
	}

	public void closeCurrentTabAndRefocusOnFirstTab() {
		getDriver().close();
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(0));
	}

	public void closeTab(int pos) {
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(pos));
		getDriver().close();
		tabs = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(0));
	}

	public void verifyElementIsNotDisplayed(String css) {
		boolean b = true;
		try {
			getDriver().findElement(By.cssSelector(css));
		} catch (Exception e) {
			b = false;
		}
		Assert.assertFalse("the element is still displayed", b);
	}

	public boolean isTextPresent(String text) {
		try {
			getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			waitForTextToAppear(text);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	public void printElementDataToFile(WebElement elem, String fileName) {
		FileUtils.printToFile(elem.getText().trim(), FileUtils.getTestFilesLocation() + fileName);
	}

	public void verifyElementDataInFile(WebElement elem, String fileName) {
		Assert.assertTrue("data from: '" + fileName + "' was incorrect", elem.getText().trim()
				.contentEquals(FileUtils.readFromFile(FileUtils.getTestFilesLocation() + fileName).trim()));
	}

	public boolean containsCaseInsensitive(List<String> l, String s) {
		for (String string : l) {
			if (string.equalsIgnoreCase(s)) {
				return true;
			}
		}
		return false;
	}

	public void waitForAJAXToComplete() {
		// waits for a max of 3 minutes
		for (int i = 0; i < 90; i++) {
			if (!JavaScriptUtils.isAjaxLoading(getDriver())) {
				break;
			}
			waitABit(Constants.DEFAULT_WAIT_TIME);
		}
	}

	public List<String> populateList(List<WebElement> webElementList) {
		List<String> populatedList = new ArrayList<String>();
		for (WebElement e : webElementList) {
			populatedList.add(e.getText());
		}
		return populatedList;
	}

	public List<String> getWebElementsTextAsList(String css) {
		List<WebElement> webElementsList = getDriver().findElements(By.cssSelector(css));
		List<String> returnList = new ArrayList<>();
		for (WebElement e : webElementsList) {
			returnList.add(e.getText());
		}
		return returnList;
	}

	public void verifyAllListElements(List<WebElement> elementsList, String[] elements) {
		List<String> actualList = populateList(elementsList);
		List<String> expectedList = new ArrayList<>(Arrays.asList(elements));
		Assert.assertTrue("Elements are not the same", actualList.equals(expectedList));
	}

	public void verifyAllListElements(String css, String[] elements) {
		List<String> actualList = getWebElementsTextAsList(css);
		List<String> expectedList = new ArrayList<>(Arrays.asList(elements));
		Assert.assertTrue("Elements are not the same", actualList.equals(expectedList));
	}

	public void verifyAllListElements(List<WebElement> elementsList, List<String> expectedList) {
		List<String> actualList = populateList(elementsList);
		Assert.assertTrue("Elements are not the same", actualList.equals(expectedList));
	}

	public void verifyAllListElements(List<WebElement> webElementsList, String[] stringsArray, String errorMessage) {
		List<String> actualList = populateList(webElementsList);
		List<String> expectedList = new ArrayList<>(Arrays.asList(stringsArray));
		Assert.assertTrue(errorMessage, actualList.equals(expectedList));
	}

	public void verifyMessage(String message) {
		WebElement messageElement = getDriver().findElement(By.cssSelector("div.x-window-text"));
		element(messageElement).waitUntilVisible();
		Assert.assertTrue("Message: " + message + " was not displayed",
				messageElement.getText().contentEquals(message));
	}

	public List<WebElement> getWebElementsList(String listCss, String elementsName) {
		List<WebElement> returnList = new ArrayList<WebElement>();
		List<WebElement> elementsList = getDriver().findElements(By.cssSelector(listCss));
		waitABit(1000);
		for (WebElement e : elementsList) {
			if (e.getText().contentEquals(elementsName)) {
				returnList.add(e);
			}
		}
		return returnList;
	}

	public void printDashboardReportDataToFile(int reportPosition, String fileName) {
		WebElement dashboardTable = getWebElement("div.x-dashboardpanel-reportview", reportPosition);
		FileUtils.printToFile(dashboardTable
				.findElement(By.cssSelector("div.x-panel-body-dashboardpanel.x-noborder-trbl")).getText().trim(),
				FileUtils.getTestFilesLocation() + fileName);
	}

	public void scrollIntoView(WebElement elem) {
		// started behaving weird on 23.03.2018 (html above the element is removed :| )
		// ((JavascriptExecutor)
		// getDriver()).executeScript("arguments[0].scrollIntoView();", itemm);

		Actions actions = new Actions(getDriver());
		actions.moveToElement(elem).perform();
	}

}
