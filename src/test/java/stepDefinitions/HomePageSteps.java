package stepDefinitions;



import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

import DigiHome.pageObjects.HomePO;
import commons.PageGeneratorManager;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {
	private WebDriver driver;
	private HomePO homePage;
	
	public HomePageSteps() {
		driver = Hooks.openAndQuitBrowser();
		System.out.println("Driver ID at HomePageSteps = " + driver.toString());
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	
	@Then("^Verify Need Some Help Message displayed$")
	public void verifyNeedSomeHelpMessageDisplayed() {
		assertTrue(homePage.isNeedSomeHelpMessageDisplayed());

	}



}
