package stepDefinitions;

import DigiHome.pageObjects.ComponentPO;
import DigiHome.pageObjects.ParkingPO;
import commons.AbstractTest;
import commons.PageGeneratorManager;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.ComponentPageSteps.valueRandom;

public class ParkingPageSteps {

    private WebDriver driver;
    private ParkingPO parkingPage;
    private ComponentPO componentPage;
    AbstractTest abstractTest;


    public ParkingPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        System.out.println("Driver ID at ComponentPageSteps = " + driver.toString());
        parkingPage = PageGeneratorManager.getParkingPage(driver);
        componentPage = PageGeneratorManager.getComponentPage(driver);
        abstractTest = new AbstractTest();
    }

    @Then("^Verify project displayed with value random$")
    public void verifyProjectDisplayedWithValueRandom() {
        
        assertEquals(valueRandom, parkingPage.getProjectActive(valueRandom));
    }

    @When("^Click to dynamic \"([^\"]*)\" tap$")
    public void clickToDynamicTap(String nameTap) {
      parkingPage.clickParkingTap(nameTap);
    }

    @Then("^Verify dynamic tr \"([^\"]*)\" and td \"([^\"]*)\" has text is value random name$")
    public void verifyDynamicTrAndTdHasTextIsValueRandomName(String trNumber, String tdNumber) {
        assertEquals(valueRandom,componentPage.textInTable(trNumber,tdNumber,valueRandom));

    }

    @Then("^Verify dynamic tr \"([^\"]*)\" and td \"([^\"]*)\" has text is today date$")
    public void verifyDynamicTrAndTdHasTextIsTodayDate(String trNumber, String tdNumber) {
        assertEquals(abstractTest.getToday(),componentPage.textInTable(trNumber,tdNumber,abstractTest.getToday()));

    }


}
