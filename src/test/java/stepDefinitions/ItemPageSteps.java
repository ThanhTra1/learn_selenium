package stepDefinitions;

import DigiHome.pageObjects.ComponentPO;
import DigiHome.pageObjects.ItemPO;
import DigiHome.pageObjects.ParkingPO;
import commons.AbstractTest;
import commons.PageGeneratorManager;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ItemPageSteps {

    private WebDriver driver;
    private ItemPO itemPage;
    private ComponentPO componentPage;
    AbstractTest abstractTest;


    public ItemPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        System.out.println("Driver ID at ComponentPageSteps = " + driver.toString());

        componentPage = PageGeneratorManager.getComponentPage(driver);

        itemPage = PageGeneratorManager.getItemPage(driver);
    }

    @And("^I upload file$")
    public void iUploadFile() {

    //    itemPage.enterValuetoHiddenElement();
      /*  WebElement elem = driver.findElement(By.xpath("//input[@id = 'img']"));
        String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";

        ((JavascriptExecutor) driver).executeScript(js, elem);
        elem.sendKeys("D:\\pexels-chevanon-photography-1108099.jpg");*/
        /*StringSelection stringSelection = new StringSelection("D:\\pexels-chevanon-photography-1108099.jpg");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Robot robot = null;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);*/
    }

    @And("^I enable dynamic \"([^\"]*)\" hidden element$")
    public void iEnableDynamicHiddenElement(String inputID) {

    }

    @And("^I enter dynamic \"([^\"]*)\" hidden element with value \"([^\"]*)\"$")
    public void iEnterDynamicHiddenElementWithValue(String inputID, String enterText) {
        itemPage.enterValuetoHiddenElement(inputID,enterText);
    }

    @Then("^Check dynamic \"([^\"]*)\" image display$")
    public void checkDynamicImageDisplay(String arg0) {
        Assert.assertTrue(itemPage.checkImage(arg0));
    }
}
