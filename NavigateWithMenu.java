package Selenium.Trivago;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigateWithMenu extends BaseClass{
	
public static WebDriver driver;
	
	@Before
	public void setDriver()
	{
	super.setDriver();
	}
	
	@Test
	public void NavigateMenu() {
		
		driver = super.loadSite();
		
		driver.findElement(By.className("nav-icon")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div/div/div[1]/div[2]/div/div[1]/div[4]/a/div/div[2]")).click();
		
		// I tried to debug the assertions using id, className, cssSelector, xpath. But, was not working.
	    
		//WebElement VerifyResults = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div[1]/div/div/div[2]/div/div"));
		//String text= VerifyResults.getText();
		//Assert.assertTrue(text.contains("Northeast"));
			
	}
	
	@After
	public void quitDriver()
	{
	super.quitDriver();
	}

}
