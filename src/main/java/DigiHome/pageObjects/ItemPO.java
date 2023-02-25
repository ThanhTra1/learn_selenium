package DigiHome.pageObjects;

import DigiHome.pageUIs.ItemUI;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ItemPO  extends AbstractPage {
    WebDriver driver;

    public ItemPO(WebDriver driverLocal){
        super(driverLocal);
        driver = driverLocal;
    }

    public void enterValuetoHiddenElement(String idInput,String enterText){
        String path = System.getProperty("user.dir") +enterText;
        waitToElementPresence(ItemUI.HIDDEN_ELEMENT_XPATH,idInput);
        sendKeyenableElement(ItemUI.HIDDEN_ELEMENT_XPATH,path,idInput);
     //   sendkeyToElement(ItemUI.HIDDEN_ELEMENT_XPATH,enterText,idInput);
    }

    public boolean checkImage(String id){
      return   checkImageDisplay(ItemUI.IMGAE_XPATH,id);
    }

}
