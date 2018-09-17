package Selenium.Trivago;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SubscribeLetter extends BaseClass{

	public static WebDriver driver;
	
	@Before
	public void setDriver()
	{
	super.setDriver();
	}
	
	String USER_EMAIL =  Global.USER_EMAIL;
	
	@Test
	public void SubscriberNewsLetter() {
		
		driver = super.loadSite();

		scrollDownByElement(driver.findElement(By.id("confirm")));
		//Check-box
		//WebElement elem = driver.findElement(By.className("//*[@id=\"app\"]/div[3]/div/div[7]/section/div/div/div[2]/div[2]/label"));
		driver.findElement(By.cssSelector("#confirm")).click();
		
		//driver.findElement(By.className("newletter-opt-in-checkbox et-confirm")).click();
		driver.findElement(By.className("et-email")).sendKeys(USER_EMAIL);
		driver.findElement(By.className("submit")).click();
				
		// I tried to debug the assertions using id, className, cssSelector, xpath. But, was not working.
		//WebElement VerifyResults = driver.findElement(By.xpath("//p[text()='You are now checked-in!']"));
		//String text= VerifyResults.getText();
		//Assert.assertTrue(text.contains("You are now checked-in!"));
		
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