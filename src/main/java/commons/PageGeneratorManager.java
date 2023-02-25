package commons;

import DigiHome.pageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	
	public static ComponentPO getComponentPage(WebDriver driver) {
		return new ComponentPO(driver);
	}
	
	public static HomePO getHomePage(WebDriver driver) {
		return new HomePO(driver);
	}

	public static IssuePO getIssuePage(WebDriver driver) {
		return new IssuePO(driver);
	}

	public static ParkingPO getParkingPage(WebDriver driver) {
		return new ParkingPO(driver);
	}

	public static ItemPO getItemPage(WebDriver driver) {
		return new ItemPO(driver);
	}


}
