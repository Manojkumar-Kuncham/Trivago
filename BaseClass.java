package Selenium.Trivago;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
public static WebDriver driver;

public WebDriver loadSite(){
driver.get(Global.Test_Url);
return driver;
}

public void setDriver() {
	BrowserProvider browser_provider = new BrowserProvider();
	driver = browser_provider.getChromeWebDriver();
}

public void verifyText(WebElement element, String textToVerify) {
	try {
		String extractText=element.getText();
		if(extractText.contains(textToVerify)) {
			System.out.println("Verified text successfully");
		}else {
			System.out.println("Verification failed in verify text");
		}
			
		
	}catch(Exception e) {
		System.out.println("Not able to search the text");
	}
	
		}


// Helper method which closes and quits the browser instance
public void quitDriver()
{
driver.close();
driver.quit();
}

}
