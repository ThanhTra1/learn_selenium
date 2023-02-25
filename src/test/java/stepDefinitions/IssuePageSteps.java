package stepDefinitions;

import DigiHome.pageObjects.ComponentPO;
import DigiHome.pageObjects.IssuePO;
import commons.PageGeneratorManager;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import static org.junit.Assert.*;
import static stepDefinitions.ComponentPageSteps.valueRandom;

public class IssuePageSteps {
    private WebDriver driver;
    private IssuePO issuePage;
    private ComponentPO componentPO;



    public IssuePageSteps() {
        driver = Hooks.openAndQuitBrowser();
        System.out.println("Driver ID at ComponentPageSteps = " + driver.toString());
        issuePage = PageGeneratorManager.getIssuePage(driver);
        componentPO = PageGeneratorManager.getComponentPage(driver);
    }

    @And("^I select in dynamic custom dropdown \"([^\"]*)\" with list item \"([^\"]*)\" item \"([^\"]*)\"$")
    public void iSelectInDynamicCustomDropdownWithListItemItem(String dropdownID, String listItemId, String exceptID)  {
        issuePage.clickItemInCustomDropdown(dropdownID,listItemId,exceptID);
    }

    @And("^Verify dynamic \"([^\"]*)\" is Next (\\d+) Hour$")
    public void iSeeDynamicIsNextHour(String timeID, int nextHour){
        assertTrue(issuePage.checkTime(issuePage.getText(timeID),nextHour));
        //Assert.assertEquals(issuePage.getText(timeID), issuePage.getCurrentTime(nextHour));


    }

    @Then("^Verify dynamic text \"([^\"]*)\" is displayed in table \"([^\"]*)\"$")
    public void verifyDynamicTextInTableIsDisplayed(String textTable, String rowID) {
        assertEquals(textTable, issuePage.getTextInDynamicTable(rowID,textTable));

    }

    @Then("^Verify dynamic text \"([^\"]*)\" in list \"([^\"]*)\" with dropdown \"([^\"]*)\"$")
	public void verifyDynamicTextInListWithDropdown(String exceptText, String listItemID, String dropDownList)  {
		assertTrue(issuePage.isItemInDropDown(dropDownList,listItemID,exceptText));
	}

    @Then("^Verify dynamic text \"([^\"]*)\" disable list \"([^\"]*)\" with dropdown \"([^\"]*)\"$")
    public void verifyDynamicTextDisableListWithDropdown(String exceptText, String listItemID, String dropDownList)  {
        assertFalse(issuePage.isItemInDropDown(dropDownList,listItemID,exceptText));
    }

    @When("^I select in dynamic custom dropdown \"([^\"]*)\" with list item \"([^\"]*)\" item random$")
    public void iSelectInDynamicCustomDropdownWithListItemItemRandom(String dropDownID, String listItemID) {
        issuePage.clickItemInCustomDropdown(dropDownID,listItemID,valueRandom);
    }

    @And("^Input to dymanic textbox \"([^\"]*)\" with new value random$")
    public void inputToDymanicTextboxWithNewValueRandom(String textID) {
        String text = "Tra" + Hooks.randomNumber();
        componentPO.inputToDynamicTextbox(textID, text);
    }

    @Then("^Verify dynamic tr \"([^\"]*)\" and td \"([^\"]*)\" has text is \"([^\"]*)\" in second page$")
    public void verifyDynamicTrAndTdHasTextIsInSecondPage(String trNumber, String tdNumber, String exceptText){
        assertEquals(exceptText, issuePage.getTextInSecondPage(trNumber,tdNumber,exceptText));

    }

    @And("^Verify dynamic tr \"([^\"]*)\" and td \"([^\"]*)\" is displayed random in table$")
    public void verifyDynamicTrAndTdIsDisplayedRandomInTable(String trNumber, String tdNumber) {
        assertEquals(valueRandom, componentPO.textInTable(trNumber,tdNumber,valueRandom));
    }
}
