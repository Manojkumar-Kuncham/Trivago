package Selenium.Trivago;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomatedTestOne extends BaseClass {

public static WebDriver driver;
	
	@Before
	public void setDriver()
	{
	super.setDriver();
	}
	
	String MOBILE_APP_URL = Global.MOBILE_APP_URL;
	String PLAYSTORE_URL = Global.PLAYSTORE_URL;
	
	@Test
	public void NavigateToPlayStore() {
		
		driver = super.loadSite();
		
		scrollDownByElement(driver.findElement(By.className(" cip__attached")));
		driver.findElement(By.className(" cip__attached")).click();
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles()); 
		//Navigate to New Tab 
		driver.switchTo().window(tabs2.get(1));
		driver.switchTo().window(tabs2.get(1));
		driver.navigate().to(MOBILE_APP_URL);
		driver.findElement(By.xpath("//*[@id=\"js_scroll_detect\"]/a[1]/img")).click();
		
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles()); 
		//Navigate to New Tab 
		driver.switchTo().window(tabs3.get(2));
		driver.switchTo().window(tabs3.get(2));
		driver.navigate().to(PLAYSTORE_URL);
		
		/// Assertion Required
}
	// Method to scroll to the element	
	private void scrollDownByElement(WebElement element) {
		
		JavascriptExecutor javascript=(JavascriptExecutor)driver;
		javascript.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	@After
	public void quitDriver()
	{
	super.quitDriver();
	}
}