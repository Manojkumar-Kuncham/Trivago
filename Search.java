package com.trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TrivagoUtils.CommonFunctions;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Search extends CommonFunctions {
	
	@Before()
	public void preCondition() {
		
	}
	
	@Given("^open the chrome browser$")
	public void open_the_chrome_browser() throws Throwable {
	    openChromeBrowser();
	}

	@Then("^navigate to trivago site$")
	public void navigate_to_trivago_site() throws Throwable {
	    navigateToUrl("http://room5.trivago.com");
	}

	@Then("^search for belgium$")
	public void search_for_belgium() throws Throwable {
	 	  		
		  waitForElement(20,driver.findElement(By.cssSelector("#header > div > div > div.search-icon")));
		  clickElement(driver.findElement(By.cssSelector("#header > div > div > div.search-icon")));
		  waitForTime(2000);
		  searchTextAndEnter(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/input")), "belgium");
	}
	
	  
	@And("^verify the Result$")
	public void verify_the_Result() throws Throwable {
				waitForTime(3000);
			    waitForElement(20, driver.findElement(By.cssSelector(".search-results>.section-title")));
			    verifyText(driver.findElement(By.cssSelector(".search-results>.section-title")), "7 Search Results");
			}	 
	

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	  		closeBrowser();
	}	
		
	@Then("^subscribe the email$")
	public void subscribe_the_email() throws Throwable {
		scrollDownByElement(driver.findElement(By.id("confirm")));
		clickElement(driver.findElement(By.id("confirm")));
		enterTestData(driver.findElement(By.name("email")), "ss"+System.currentTimeMillis()+"@ee.com");
		waitForTime(3000);
		clickElement(driver.findElement(By.className("submit")));
		waitForTime(3000);
	}

	@Then("^verify subscription was successful$")
	public void verify_subscription_was_successful() throws Throwable {
		waitForTime(3000);
	    waitForElement(20, driver.findElement(By.xpath("//p[text()='You are now checked-in!']")));
	}
	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    closeBrowser();
	}
	
	@Then("^click on the featured article$")
	public void click_on_the_featured_article() throws Throwable {
	    waitForElement(20,driver.findElement(By.cssSelector("#app > div.content-wrapper > div > div:nth-child(1) > div > a > div.container-wide.home-container > div > div.hero-button")));
		  clickElement(driver.findElement(By.cssSelector("#app > div.content-wrapper > div > div:nth-child(1) > div > a > div.container-wide.home-container > div > div.hero-button")));
	}
	@Then("^verify the result$")
	public void verify_the_result() throws Throwable {
		waitForTime(3000);
	    waitForElement(20, driver.findElement(By.xpath("//*[@id=\"winter-family-vacations\"]/div[1]/p")));
	}
	@Then("^you can close browser$")
	public void you_can_close_browser() throws Throwable {
		closeBrowser();
	}
}
