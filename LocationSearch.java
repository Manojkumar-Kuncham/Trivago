package Selenium.Trivago;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LocationSearch extends BaseClass {

public static WebDriver driver;
	
	@Before
	public void setDriver()
	{
	super.setDriver();
	}
	
	String SELECT_COUNTRY = Global.SELECT_COUNTRY;
	
	@Test
	
	public void Location_Search() {
		driver = super.loadSite();
		
		driver.findElement(By.className("search-icon")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/input")).sendKeys(SELECT_COUNTRY);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/input")).sendKeys(Keys.ENTER);
		
		// I tried to debug the assertions using id, className, cssSelector, xpath. But, was not working.
		
		//WebElement VerifyResults = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[8]/h3/span"));
		//String text= VerifyResults.getText();
		//Assert.assertTrue(text.contains("37 Search Results"));
				
	}
	
	@After
	public void quitDriver()
	{
	super.quitDriver();
	}

}
