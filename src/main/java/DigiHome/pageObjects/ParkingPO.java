package DigiHome.pageObjects;

import DigiHome.pageUIs.ParkingUI;
import commons.AbstractPage;
import commons.AbstractTest;
import org.openqa.selenium.WebDriver;

public class ParkingPO extends AbstractPage {
    WebDriver driver;

    public ParkingPO(WebDriver driverLocal){
        super(driverLocal);
        driver = driverLocal;
    }

    public String getProjectActive(String excetText){
        try {
            waiTextToBePresentInElementLocated(ParkingUI.XPATH_PROJECT_ACTIVE_PARKING, excetText, "");
        } finally {
            return getTextElement(ParkingUI.XPATH_PROJECT_ACTIVE_PARKING);
        }

    }

    public void clickParkingTap(String nameTap){
        waitToElementVisible(ParkingUI.XPATH_DYNAMIC_TAP_TEXT,nameTap);
        clickToElement(ParkingUI.XPATH_DYNAMIC_TAP_TEXT,nameTap);
    }

}
