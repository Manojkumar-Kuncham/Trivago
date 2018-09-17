package Selenium.Trivago;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomatedTestTwo extends BaseClass {

public static WebDriver driver;
	
	@Before
	public void setDriver()
	{
	super.setDriver();
	}
	
	String SELECT_MENU_COUNTRY = Global.SELECT_MENU_COUNTRY;
	
	@Test
	public void SelectCountryDropDownMenu() {
		
		driver = super.loadSite();
		scrollDownByElement(driver.findElement(By.className("locales-dropdown")));
		new Select(driver.findElement(By.className("locales-dropdown"))).selectByVisibleText(SELECT_MENU_COUNTRY);
		
		//Assertion Requirers
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
