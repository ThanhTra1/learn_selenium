package DigiHome.pageObjects;

import org.openqa.selenium.WebDriver;

import DigiHome.pageUIs.HomePageUI;
import commons.AbstractPage;

public class HomePO extends AbstractPage {
	WebDriver driver;

	public HomePO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public boolean isNeedSomeHelpMessageDisplayed() {
		waitToElementVisible(HomePageUI.NEED_SOME_HELP_MESSAGE);
		return isElementDisplayed(HomePageUI.NEED_SOME_HELP_MESSAGE);
	}


}
