package com.avenuecode;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.After;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.avenuecode.pages.HomePage;
import com.avenuecode.pages.CareerPage;

public class CareerSteps {
	WebDriver driver;
	
	
	@Before
	public void start() {
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^I visit Avenue Code website$")
	public void i_visit_Avenue_Code_website() throws Throwable {
	    driver.get("https://www.avenuecode.com");
	}

	@When("^I navigate to Careers page$")
	public void i_navigate_to_Careers_page() throws Throwable {
	    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	    homePage.naviteToCarrersPage();
	}

	@Then("^I should see six job locations$")
	public void i_should_see_six_job_locations() throws Throwable {
	    CareerPage careerPage = PageFactory.initElements(driver, CareerPage.class);
	    int currentQuantity = careerPage.cityTotalCount();
	    assertEquals(6, currentQuantity);
	}
}
