package DigiHome.pageObjects;

import DigiHome.pageUIs.ComponentPageUI;
import DigiHome.pageUIs.IssuePageUI;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class IssuePO extends AbstractPage {
    WebDriver driver;

    public IssuePO(WebDriver driverLocal) {
        super(driverLocal);
        driver = driverLocal;
    }
    public void clickItemInCustomDropdown(String dropDownID, String listItemID, String exceptItem){
        String locatorDropdown = castRestParameter(ComponentPageUI.DYNAMIC_ITEM_IN_CUSTOM_DROPDOWN, dropDownID);
        String locatorListItem =  castRestParameter(IssuePageUI.DYNAMIC_ALL_ITEM_DROPDOWN, listItemID);
        selectItemInCustomDropdowns(locatorDropdown,locatorListItem,exceptItem);
    }

    public String getTextAttribute(String textID, String attribute){
        waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_PAGE, textID);
        return getTextAttribute(ComponentPageUI.DYNAMIC_TEXT_PAGE, attribute, textID);
    }

    public String getText(String textID){
        waitToElementVisible(ComponentPageUI.DYNAMIC_TEXT_PAGE, textID);
        return getTextElement(ComponentPageUI.DYNAMIC_TEXT_PAGE,textID);
    }

    public String getTextInDynamicTable(String textID,String exceptText) {

        waiTextToBePresentInElementLocated(ComponentPageUI.DYNAMIC_TEXT_TABLE,exceptText,textID);
        return getTextElement(ComponentPageUI.DYNAMIC_TEXT_TABLE, textID);
    }

    public boolean isItemInDropDown(String dropDownID, String listItemID, String exceptText){
        String locatorDropdown = castRestParameter(ComponentPageUI.DYNAMIC_ITEM_IN_CUSTOM_DROPDOWN, dropDownID);
        String locatorListItem =  castRestParameter(IssuePageUI.DYNAMIC_ALL_ITEM_DROPDOWN, listItemID);
        return isTextInDropDownList(locatorDropdown,locatorListItem,exceptText);
    }

    public String getTextInSecondPage(String trIndex,String tdInex, String exceptedText){
        String[] arrayID = {trIndex , tdInex};
        waiTextToBePresentInElementLocated(IssuePageUI.DYNAMIC_TEXT_SECOND_PAGE,exceptedText,arrayID);
        return getTextElement(IssuePageUI.DYNAMIC_TEXT_SECOND_PAGE,arrayID);
    }

    public boolean checkTime(String text, int hour){
        boolean check = text.contains(getCurrentTime(hour));
        System.out.println("ket qua" + check);
        return check;
    }

}
