package Selenium.Trivago;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserProvider {

	public WebDriver getChromeWebDriver(){
		// Provides the webdriver instance

		System.setProperty("webdriver.chrome.driver", Global.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();

		return driver;
		}
}
