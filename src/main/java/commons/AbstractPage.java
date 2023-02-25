package commons;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
	By by;
	Select select;
	Actions action;
	WebElement element;
	long shortTimeout = 5;
	long longTimeout = 30;
	WebDriver driver;
	List<WebElement> elements;
	WebDriverWait waitExplicit;
	JavascriptExecutor jsExecutor;

	public AbstractPage(WebDriver driver) {

		this.driver = driver;
		jsExecutor = (JavascriptExecutor) driver;
		waitExplicit = new WebDriverWait(driver, longTimeout);
		action = new Actions(driver);
	}
	// Web Browser: open page/ getUrl/ getTitle/ Window/ Alert/ Page Source..

	public void openUrl(String urlValue) {
		driver.get("urlValue");
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getPageSourceCode() {
		return driver.getPageSource();
	}

	public void backToPage() {
		driver.navigate().back();
	}

	public void refreshToPage() {
		driver.navigate().refresh();
	}

	public void forwardToPage() {
		driver.navigate().forward();
	}

	public void waitAlertPresence() {
		waitExplicit.until(ExpectedConditions.alertIsPresent());
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void cancelAlert() {
		driver.switchTo().alert().dismiss();
	}

	public void senkeyToAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public String getTextAlert() {
		return driver.switchTo().alert().getText();
	}

	// Web Element: click/ send key/ submit/ select/ getText/ getAtribute/ Css/ ...

	public void clickToElement(String locator) {
		element = find(locator);

		element.click();
	}

	public void clickToElement(String locator, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		action.moveToElement(element).perform();
		action.click(element).perform();
		//element.click();
	}

	public String castRestParameter(String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		return locator;
	}

	public void sendkeyToElement(String locator, String value) {
		element = find(locator);
		element.clear();
		element.sendKeys(value);
	}

	public void sendkeyToElement(String locator, String valueToSendkey, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		action.click(element)
				.keyDown(Keys.CONTROL)
				.sendKeys("a")
				.keyUp(Keys.CONTROL)
				.sendKeys(Keys.BACK_SPACE)
				.build()
				.perform();
		//element.clear();
		element.sendKeys(valueToSendkey);
	}

	public void sendKeyenableElement(String locator, String enterText, String... values){
		locator = castRestParameter(locator, values);
		element = find(locator);
		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
		jsExecutor.executeScript(js, element);
		element.sendKeys(enterText);

	}
	public void selectItemInDropdown(String locator, String valueItem) {
		element = find(locator);
		select = new Select(element);
		select.selectByVisibleText(valueItem);
	}

	public void selectItemInDropdown(String locator, String valueItem, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		select = new Select(element);
		select.selectByVisibleText(valueItem);
//		driver.switchTo().frame(element);
	}

	public String getValueItemInDropdown(String locator) {
		element = find(locator);
		select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}

	public void selectItemInCustomDropdowns(String parentLocator, String allItemsLocator, String expectedItem) {
		element = find(parentLocator);
		//action.moveToElement(element).perform();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

		element.click();

		waitExplicit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(allItemsLocator)));
		elements = driver.findElements(By.xpath(allItemsLocator));
		for (WebElement item : elements) {
			//System.out.println(item.getText());
			if (item.getText().equals(expectedItem)) {
				jsExecutor.executeScript("arguments[0].scrollIntoView;", item);
				sleepInSecond(1);
				item.click();
				sleepInSecond(2);
				break;

			}
		}
	}


	public void clickbyJS(String locator, String... values){
		locator = castRestParameter(locator, values);
		element = find(locator);
		sleepInSecond(1);
		jsExecutor.executeScript("argument[0].click();", element);

	}

	public void sleepInSecond(long numberInSecond) {
		try {
			Thread.sleep(numberInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getAttributeValue(String locator, String attributeName) {
		element = find(locator);
		return element.getAttribute(attributeName);
	}

	public String getTextElement(String locator) {
		element = find(locator);
		return element.getText();
	}

	public String getTextElement(String locator, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		return element.getText();
	}

	public String getTextAttribute(String locator,String attribute, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		return element.getAttribute(attribute);
	}
	public int countElementNumber(String locator) {
		elements = finds(locator);
		return elements.size();
	}

	public List<WebElement> finds(String locator) {
		return driver.findElements(By.xpath(locator));
	}

	public void checkToCheckbox(String locator) {
		element = find(locator);
		if (element.isSelected() == false) {
			element.click();
		}
	}

	public void checkToCheckbox(String locator, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		if (element.isSelected() == false) {
			element.click();
		}
	}

	public void unCheckToCheckbox(String locator) {
		element = find(locator);
		if (element.isSelected() == true) {
			element.click();
		}
	}

// Check element displayed/ un-displayed
	public boolean isElementDisplayed(String locator) {
		overideGlobalTimeout(longTimeout);
		try {
			element = find(locator);
			overideGlobalTimeout(longTimeout);
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			overideGlobalTimeout(longTimeout);
			return false;
		}
	}

// Check element over timeout
	public void overideGlobalTimeout(long timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	public boolean isElementDisplayed(String locator, String... values) {
		locator = castRestParameter(locator, values);
		overideGlobalTimeout(longTimeout);
		try {
			//Tra
			waitToElementVisible(locator);
			element = find(locator);
			overideGlobalTimeout(longTimeout);
			return element.isDisplayed();
		} catch (Exception e) {
			overideGlobalTimeout(longTimeout);
			return false;
		}

	}

	public boolean isElementSelected(String locator) {
		element = find(locator);
		return element.isSelected();

	}

	public boolean isElementSelected(String locator, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		return element.isSelected();

	}

	public boolean isElementEnabled(String locator) {
		element = find(locator);
		return element.isEnabled();

	}

	public boolean isElementEnabled(String locator, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		return element.isEnabled();

	}

	public void switchToChildWindowByID(String parent) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			if (!runWindow.equals(parent)) {
				driver.switchTo().window(runWindow);
				break;
			}
		}
	}

	public boolean closeAllWindowsWithoutParent(String parentWindow) {
		Set<String> allWindows = driver.getWindowHandles();
		driver.getWindowHandles();
		for (String runWindows : allWindows) {
			if (!runWindows.equals(parentWindow)) {
				driver.switchTo().window(runWindows);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}
    public boolean checkImageDisplay(String locator, String... values){
		String xpaht=	castRestParameter(locator,values);
		element = find(xpaht);

		Boolean p = (Boolean) ((JavascriptExecutor)driver)
				.executeScript("return arguments[0].complete "
						+ "&& typeof arguments[0].naturalWidth != \"undefined\" "
						+ "&& arguments[0].naturalWidth > 0", element);
		return p;
	}
	public void switchToWindowByTitle(String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindows : allWindows) {
			driver.switchTo().window(runWindows);
			String currentWin = driver.getTitle();

			if (currentWin.equals(title)) {
				break;
			}

		}
	}

	public void switchToFrameOrIframe(String locator) {
		element = find(locator);
		driver.switchTo().frame(element);
	}

	public WebElement find(String locator) {
		return driver.findElement(By.xpath(locator));
		
		
	}

	public void switchToParentPage() {
		driver.switchTo().defaultContent();
	}

	public void hoverToElement(String locator) {
		element = find(locator);
		action.moveToElement(element).perform();
	}
	public void hoverToElement(String locator, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		action.moveToElement(element).perform();
	}
	public void doubleClickToElement(String locator) {
		element = find(locator);
		action.doubleClick(element).perform();
	}

	public void sendKeyboardToElement(String locator, Keys key) {
		element = find(locator);
		action.sendKeys(element, key).perform();
	}

	public boolean checkAnyImageLoaded(WebDriver driver, String locator) {
		boolean status;
		element = find(locator);
		status = (boolean) jsExecutor.executeAsyncScript(
				"return argument[0].complete && typeof arguments[0].naturaWith !=\"undefined\" && argument[0].naturaWidth>0",
				element);
		if (status) {
			return true;
		} else {
			return false;
		}
	}

	public void waitToElementVisible(String locator) {
		by = byXpath(locator);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitToElementVisible(String locator, String... values) {
		locator = castRestParameter(locator, values);
		by = byXpath(locator);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitToElementPresence(String locator) {
		by = byXpath(locator);
		waitExplicit.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	public void waitToElementPresence(String locator, String... values) {
		locator = castRestParameter(locator, values);
		by = byXpath(locator);
		waitExplicit.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public void waiTextToBePresentInElementLocated(String locator, String text, String... values){
		locator = castRestParameter(locator, values);
		by = byXpath(locator);
		waitExplicit.until(ExpectedConditions.textToBePresentInElementLocated(by,text));

	}

	public By byXpath(String locator) {
		return By.xpath(locator);

	}

	public void waitToElementInvisible(String locator) {
		by = byXpath(locator);
		overideGlobalTimeout(shortTimeout);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(by));
		overideGlobalTimeout(longTimeout);
	}

	public void waitToElementClickable(String locator) {
		by = byXpath(locator);
		waitExplicit.until(ExpectedConditions.elementToBeClickable(by));
	}

	public void removeElementAttribute(String locator, String attributeToRemove) {
		element = find(locator);
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].removeAttribute('" + attributeToRemove + "');", element);
	}

	public void removeElementAttribute(String locator, String attributeToRemove, String... values) {
		locator = castRestParameter(locator, values);
		element = find(locator);
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].removeAttribute('" + attributeToRemove + "');", element);
	}

	public String getCurrentTime(int nextHour){
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthOfYear();
		int day = now.getDayOfMonth();
		int hour = now.getHourOfDay()+ nextHour;
		//int minute = now.getMinuteOfHour();

		String time = String.format ("%d/%02d/%02d %02d", day, month, year , hour);
		System.out.println("time = " + time);
		return time;
	}

	public boolean isTextInDropDownList(String parentLocator, String allItemsLocator, String expectedItem) {
		element = find(parentLocator);
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		sleepInSecond(1);
		element.click();
		sleepInSecond(1);
		waitExplicit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(allItemsLocator)));
		elements = driver.findElements(By.xpath(allItemsLocator));
		for (WebElement item : elements) {

			if (item.getText().equals(expectedItem)) {
				return  true;

			}
		}
		return false;
	}



}
