package TrivagoUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

	public static WebDriver driver;
	
	// It will open the browser
	public void openChromeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\PhD\\Selenium course\\Exe\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}catch(Exception e) {
			System.out.println("Note able to open the chrome browser");
		}
	}

	//It will navigate to the browser
	public void navigateToUrl(String url) {
		try {
			driver.get(url);
		}catch(Exception e) {
			System.out.println("Not able to navigate to given site--"+e.getMessage());
		}
		
	}
	
	public void waitForTime(long timeToWait) {
		try {
			Thread.sleep(timeToWait);
		}catch(Exception e) {
			
		}
	}
	
	public void waitForElement(long time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	// Click on the search tab
	public void clickElement(WebElement element) {
		try {
			Thread.sleep(2000);
			element.click();
		}catch(Exception e) {
			System.out.println("Not able to click element");
		}
		
	}
	
	// Search and Enter data
	
	public void searchTextAndEnter(WebElement element, String textToSearch) {
		try {
			element.clear();
			element.sendKeys(textToSearch,Keys.ENTER);
		}catch(Exception e) {
			System.out.println("Not able to search the text");
		}
				
	}
	
	public void enterTestData(WebElement element, String textToSearch) {
		try {
			element.clear();
			element.sendKeys(textToSearch);
		}catch(Exception e) {
			System.out.println("Not able to search the text");
		}
				
	}
	//It will Verify the search text
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
	
	// To close the browser
	
	public void closeBrowser() {
		driver.close();
	}
	
public void scrollDownByElement(WebElement element) {
		
		JavascriptExecutor javascript=(JavascriptExecutor)driver;
		javascript.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	
}
