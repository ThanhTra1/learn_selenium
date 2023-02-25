package stepDefinitions;

//import static org.testng.AssertJUnit.assertEquals;
//import static org.testng.AssertJUnit.assertTrue;

import java.util.concurrent.TimeUnit;

import cucumber.api.PendingException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DigiHome.pageObjects.ComponentPO;
import commons.PageGeneratorManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;


import static org.junit.Assert.*;

public class ComponentPageSteps {
	private WebDriver driver;
	private ComponentPO componentPage;

	public static String valueRandom = "chinh" + Hooks.randomNumber();
	public static int numberRandom = Hooks.randomNumber();

	public ComponentPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		System.out.println("Driver ID at ComponentPageSteps = " + driver.toString());
		componentPage = PageGeneratorManager.getComponentPage(driver);
	}

	@Given("^I open application$")
	public void i_open_application() {
		driver = new FirefoxDriver();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^Click to dynamic \"([^\"]*)\" button$")
	public void iClickToDynamicButton(String buttonValue) {
		componentPage.clickToDynamicButton(buttonValue);
	}

	@When("^Hover to tooltip dynamic \"([^\"]*)\" first button link$")
	public void hoverToFirstButtonLink(String tooltipButtonLink) {
		componentPage.hoverToDynamicFistButtonLink(tooltipButtonLink);
	}

	@And("^I click to dynamic \"([^\"]*)\" api google button$")
	public void iClickToDynamicApiGoogleButton(String buttonValue) {
		componentPage.clickToDynamicApiGoogleButton(buttonValue);
	}

	@And("^Click to dynamic \"([^\"]*)\" page link$")
	public void clickToDynamicPageLink(String pageName) {
		componentPage.clickToDynamicPageLink(pageName);
	}

	@And("^Click to dynamic \"([^\"]*)\" subpage link$")
	public void clickToDynamicSubpageLink(String subpageName) {
		componentPage.clickToDynamicSubpageLink(subpageName);
	}

	@And("^Click to dynamic \"([^\"]*)\" action first button link$")
	public void clickToDynamicActionFirstButtonLink(String nameButtonLink) {
		componentPage.clickToDynamicActionFirstButtonLink(nameButtonLink);
	}

	@And("^Click to dynamic \"([^\"]*)\" post button link$")
	public void clickToDynamicPostButtonLink(String nameButtonLink) {
		componentPage.clickToDynamicPostButtonLink(nameButtonLink);
	}

	@When("^I select in dynamic dropdown \"([^\"]*)\" with item \"([^\"]*)\"$")
	public void iSelectInDynamicDropdownWithItem(String dropdownID, String valueItem) {
		componentPage.selectInDynamicDropdownWithItem(dropdownID, valueItem);
	}

	@When("^I select in dynamic custom dropdown \"([^\"]*)\" with item \"([^\"]*)\"$")
	public void iSelectInDynamicCustomDropdownWithItem(String dropdownID, String valueItem) {
		componentPage.selectInDynamicCustomDropdownWithItem(dropdownID, valueItem);
	}

	@When("^I click to dynamic \"([^\"]*)\" dropdown list$")
	public void iClickToDynamicDropdownList(String valueItem) {
		componentPage.ClickToDynamicCustomDropdownWithItem(valueItem);
	}

	@When("^Input to dymanic textbox \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void inputToDymanicTextboxWithValue(String nameID, String value) {
		componentPage.inputToDynamicTextbox(nameID, value);
	}

	@When("^Input to dymanic textbox api google \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void inputToDymanicApiGoogleTextboxWithValue(String nameID, String value) {
		componentPage.inputToDynamicApiGoogleTextbox(nameID, value);
	}

	@When("^I check to dynamic \"([^\"]*)\" checkbox$")
	public void iCheckToDynamicCheckbox(String checkboxValue) {
		componentPage.checkToDynamicCheckbox(checkboxValue);
	}

	@When("^Input to dymanic textbox \"([^\"]*)\" with value random$")
	public void inputToDymanicTextboxWithValueRandom(String nameID) {
		componentPage.inputToDynamicTextboxWithValueRandom(nameID, valueRandom);

	}

	@When("^Input to dymanic textbox \"([^\"]*)\" with number random$")
	public void inputToDymanicTextboxWithNumberRandom(String nameID) {
		componentPage.inputToDynamicTextboxWithNumberRandom(nameID, numberRandom);

	}

	@When("^Input to dynamic textarea \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void inputToDynamicTextareaWithValue(String nameID, String value) {
		componentPage.inputToDynamicTextarea(nameID, value);
	}

	@When("^Click to dynamic \"([^\"]*)\" radio or checkbox$")
	public void clickToDynamicRadioOrCheckbox(String radioOrCheckboxID) {
		componentPage.clickToDynamicRadioOrCheckbox(radioOrCheckboxID);
	}

	@Then("^Get text in dynamic \"([^\"]*)\" noti$")
	public void getTextInDynamicNoti(String mesageValue) {
		componentPage.getTextInDynamicNoti(mesageValue);

	}

	@Then("^Verify text noti \"([^\"]*)\" is displayed in noti \"([^\"]*)\"$")
	public void verifyNotiMessageIsDisplayed(String textNoti, String mesageValue) {
		assertEquals(textNoti, componentPage.getTextInDynamicNoti(mesageValue));

	}

	@Then("^Verify dynamic text \"([^\"]*)\" is display \"([^\"]*)\" of page$")
	public void verifyDynamicTextIsDisplayOfPage(String textPage, String textValue) {
		assertEquals(textPage, componentPage.getTextInPage(textValue));
	}

	@Then("^Verify dynamic text tooltip \"([^\"]*)\" is display in tooltip \"([^\"]*)\"$")
	public void verifyDynamicTextTooltipIsDisplay(String textTooltip, String textValue)  {
		assertEquals(textTooltip, componentPage.getTextInTooltip(textValue));
	}




	@Then("^Verify \"([^\"]*)\" text is displayed$")
	public void verifyTextIsDisplayed(String textMesageValue) {
		assertTrue(componentPage.isTextMessageDisplayed(textMesageValue));

	}

	@Then("^Verify dynamic text \"([^\"]*)\" is displayed in table$")
	public void verifyTextInTableIsDisplayed(String textTableValue) {
		assertTrue(componentPage.isTextInTableDisplayed(textTableValue));

	}

	@And("^Get text dynamic in alert \"([^\"]*)\"$")
	public void getTextDynamicAlert(String textAlert) {
		assertEquals(textAlert, componentPage.getTextAlert());
	}

	@And("^Accept dynamic in alert$")
	public void acceptDynamicAlert() {
		componentPage.acceptAlert();
	}

	@And("^Click to dynamic \"([^\"]*)\" button close noti$")
	public void clickToDynamicButtonCloseNoti(String nameCloseNoti) {
		componentPage.clickToDynamicButtonCloseNoti(nameCloseNoti);

	}






	@And("^Verify dynamic \"([^\"]*)\" with text \"([^\"]*)\"$")
	public void verifyDynamicWithText(String textID, String exceptText) {
		Assert.assertEquals(exceptText,componentPage.getTextPage(textID, exceptText));

	}

	@Then("^Verify \"([^\"]*)\" text is not displayed$")
	public void verifyTextIsNotDisplayed(String textMesageValue){
		assertFalse(componentPage.checkTextInPage(textMesageValue));
	}

    @When("^Hover to dynamic \"([^\"]*)\" button$")
    public void hoverToDynamicButton(String buttonID) {
		componentPage.hoverElement(buttonID);
    }



	@When("^Click to dynamic \"([^\"]*)\" a button$")
	public void clickToDynamicAButton(String aButtonID) {
			componentPage.clickToDynamicAButton(aButtonID);
	}

	@Then("^Verify active page is \"([^\"]*)\"$")
	public void verifyActivePageIs(String exceptedText)  {
		assertEquals(exceptedText, componentPage.activePage(exceptedText));
	}

	@And("^Verify dynamic tr \"([^\"]*)\" and td \"([^\"]*)\" has text is \"([^\"]*)\"$")
	public void verifyDynamicTrAndTdHasTextIs(String trNumber, String tdNumber, String exceptedText)  {
		assertEquals(exceptedText,componentPage.textInTable(trNumber,tdNumber,exceptedText));
	}

//



}
