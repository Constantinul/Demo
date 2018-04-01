package d.d.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {

	static JavascriptExecutor jx;

	public static String getElementId(String js, WebDriver driver) {
		jx = (JavascriptExecutor) driver;
		String id = (String) jx.executeScript(Constants.RETURN + js);
		return id;
	}

	public static void executeScriptOnElement(String script, WebElement e, WebDriver driver) {
		jx = (JavascriptExecutor) driver;
		jx.executeScript(script, e);
	}

	public static void clickOnElement(WebElement e, WebDriver driver) {
		jx = (JavascriptExecutor) driver;
		jx.executeScript("arguments[0].click();", e);
	}

	public static boolean isAjaxLoading(WebDriver driver) {
		jx = (JavascriptExecutor) driver;
		return (boolean) jx.executeScript("return Ext.Ajax.isLoading();");
	}

}
