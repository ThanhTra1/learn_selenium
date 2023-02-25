package cucumberOptions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DigiHooks {
	public static WebDriver driver;
	
	@Before("@env")
	public void init() {
		driver = new FirefoxDriver();
		System.out.println("Driver ID at InteractUIHooks = " + driver.toString());
		driver.get("https://stg-digi-admin.notifun.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After("@env")
	public void clean() {
		driver.quit();
	}
	
	public static int randomNumber() {
		Random rand = new Random();
		return rand.nextInt(999999);
	}
	
	

}
