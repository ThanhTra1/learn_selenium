package DigiHome.pageObjects;

import org.openqa.selenium.WebDriver;

import DigiHome.pageUIs.ComponentPageUI;
import commons.AbstractPage;

public class ComponentPO extends AbstractPage {
	WebDriver driver;

	public ComponentPO(WebDriver driverLocal) {
		super(driverLocal);
		driver = driverLocal;
	}

	public void clickToDynamicPageLink(String pageName) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_PAGE_LINK, pageName);
		clickToElement(ComponentPageUI.DYNAMIC_PAGE_LINK, pageName);
	}

	public void hoverToDynamicFistButtonLink(String tooltipButtonLink) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TOOLTIP_BUTTON_LINK, tooltipButtonLink);
		hoverToElement(ComponentPageUI.DYNAMIC_TOOLTIP_BUTTON_LINK);
	}

	public void clickToDynamicSubpageLink(String subpageName) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_SUBPAGE_LINK, subpageName);
		clickToElement(ComponentPageUI.DYNAMIC_SUBPAGE_LINK, subpageName);
	}

	public void clickToDynamicActionFirstButtonLink(String nameButtonLink) {
		sleepInSecond(2);
		waitToElementVisible(ComponentPageUI.DYNAMIC_FIRST_BUTTON_LINK, nameButtonLink);
		clickToElement(ComponentPageUI.DYNAMIC_FIRST_BUTTON_LINK, nameButtonLink);
	}

	public void clickToDynamicPostButtonLink(String nameButtonLink) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_POST_BUTTON_LINK, nameButtonLink);
		clickToElement(ComponentPageUI.DYNAMIC_POST_BUTTON_LINK, nameButtonLink);
	}

	public void clickToDynamicButton(String buttonValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_BUTTON, buttonValue);
		clickToElement(ComponentPageUI.DYNAMIC_BUTTON, buttonValue);

	}

	public void clickToDynamicApiGoogleButton(String buttonValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_API_GOOGLE_BUTTON, buttonValue);
		clickToElement(ComponentPageUI.DYNAMIC_API_GOOGLE_BUTTON, buttonValue);

	}

	public void selectInDynamicDropdownWithItem(String nameID, String value) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_ITEM_IN_DROPDOWN, nameID);
		selectItemInDropdown(ComponentPageUI.DYNAMIC_ITEM_IN_DROPDOWN, value, nameID);
	}

	public void clickToDynamicRadioOrCheckbox(String radioOrCheckboxID) {
		//Tra
		waitToElementVisible(ComponentPageUI.DYNAMIC_CHECKBOX, radioOrCheckboxID);
		clickToElement(ComponentPageUI.DYNAMIC_CHECKBOX, radioOrCheckboxID);
	}

	public void inputToDynamicTextbox(String nameID, String value) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXTBOX, nameID);
		sendkeyToElement(ComponentPageUI.DYNAMIC_TEXTBOX, value, nameID);
	}

	public void inputToDynamicApiGoogleTextbox(String nameID, String value) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_API_GOOGLE_TEXTBOX, nameID);
		sendkeyToElement(ComponentPageUI.DYNAMIC_API_GOOGLE_TEXTBOX, value, nameID);
	}

	public void inputToDynamicTextboxWithValueRandom(String nameID, String valueRandom) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXTBOX, nameID);
		sendkeyToElement(ComponentPageUI.DYNAMIC_TEXTBOX, valueRandom, nameID);

	}

	public void inputToDynamicTextarea(String nameID, String value) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXTAREA, nameID);

		sendkeyToElement(ComponentPageUI.DYNAMIC_TEXTAREA, value, nameID);
	}

	public String getTextInDynamicNoti(String mesageValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_NOTI, mesageValue);
		return getTextElement(ComponentPageUI.DYNAMIC_TEXT_NOTI, mesageValue);
	}

	public String getTextInDynamicTable(String textValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_TABLE, textValue);
		return getTextElement(ComponentPageUI.DYNAMIC_TEXT_TABLE, textValue);
	}


	public boolean isNotiMessageDisplayed(String mesageValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_NOTI, mesageValue);
		return isElementDisplayed(ComponentPageUI.DYNAMIC_TEXT_NOTI, mesageValue);
	}

	public boolean isTextMessageDisplayed(String textMesageValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_MESSAGE, textMesageValue);
		return isElementDisplayed(ComponentPageUI.DYNAMIC_TEXT_MESSAGE, textMesageValue);
	}

	public boolean isTextInTableDisplayed(String textTableValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_TABLE, textTableValue);
		return isElementDisplayed(ComponentPageUI.DYNAMIC_TEXT_TABLE, textTableValue);
	}

	public void checkToDynamicCheckbox(String checkboxValue) {
		waitToElementPresence(ComponentPageUI.DYNAMIC_CHECKBOX, checkboxValue);
		checkToCheckbox(ComponentPageUI.DYNAMIC_CHECKBOX, checkboxValue);

	}

	public void clickToDynamicButtonCloseNoti(String nameCloseNoti) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_BUTTON_CLOSE_NOTI, nameCloseNoti);
		clickToElement(ComponentPageUI.DYNAMIC_BUTTON_CLOSE_NOTI, nameCloseNoti);
	}

	public void inputToDynamicTextboxWithNumberRandom(String nameID, int numberRandom) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXTBOX, nameID);
		sendkeyToElement(ComponentPageUI.DYNAMIC_TEXTBOX, nameID);
	}

	public void selectInDynamicCustomDropdownWithItem(String dropdownID, String valueItem) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_ITEM_IN_CUSTOM_DROPDOWN, dropdownID);
		selectItemInCustomDropdowns(ComponentPageUI.DYNAMIC_ITEM_IN_CUSTOM_DROPDOWN, valueItem, dropdownID);

	}

	public String getTextInTooltip(String textValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_TOOLTIP, textValue);
		return getTextElement(ComponentPageUI.DYNAMIC_TEXT_TOOLTIP, textValue);


	}

    public String getTextInPage(String textValue) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_PAGE, textValue);
		return getTextElement(ComponentPageUI.DYNAMIC_TEXT_PAGE, textValue);
    }

    public String getTextPage(String textID, String exceptText) {
		waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_PAGE, textID);
		waiTextToBePresentInElementLocated(ComponentPageUI.DYNAMIC_TEXT_PAGE,exceptText,textID);
		return getTextElement(ComponentPageUI.DYNAMIC_TEXT_PAGE, textID);
	}

	public void ClickToDynamicCustomDropdownWithItem(String valueItem) {
		waitToElementPresence(ComponentPageUI.DYNAMIC_ITEM_IN_CUSTOM_DROPDOWN, valueItem);
		clickToElement(ComponentPageUI.DYNAMIC_ITEM_IN_CUSTOM_DROPDOWN, valueItem);
	}
//


	public boolean checkTextInPage(String text){
		return getPageSourceCode().contains(text);
	}

	public void hoverElement(String buttonID){
		waitToElementVisible(ComponentPageUI.DYNAMIC_A_BUTTON, buttonID);
		hoverToElement(ComponentPageUI.DYNAMIC_A_BUTTON,buttonID);
	}

	//
	public void clickToDynamicAButton(String buttonID){
		waitToElementVisible(ComponentPageUI.DYNAMIC_A_BUTTON, buttonID);
		clickToElement(ComponentPageUI.DYNAMIC_A_BUTTON, buttonID);
	}

	public String activePage(String exceptedText){
		waiTextToBePresentInElementLocated(ComponentPageUI.DYNAMIC_ACTIVE_PAGE,exceptedText,"");
		return getTextElement(ComponentPageUI.DYNAMIC_ACTIVE_PAGE);
	}

	public String textInTable(String trIndex, String tdInex, String exceptedText){
		String[] arrayID = {trIndex , tdInex};
		waiTextToBePresentInElementLocated(ComponentPageUI.DYNAMIC_TABLE,exceptedText,arrayID);
		return getTextElement(ComponentPageUI.DYNAMIC_TABLE,arrayID);
	}
}
