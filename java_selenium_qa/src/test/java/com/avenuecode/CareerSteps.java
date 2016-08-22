package com.avenuecode;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.After;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.avenuecode.pages.HomePage;
import com.avenuecode.pages.CareerPage;

public class CareerSteps {
	public static WebDriver driver;
	
	
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

//  It' s possible to do that?
//	@And("^I navigate to Careers page$")
//	@When("^I navigate to Careers page$")
//	public void i_navigate_to_Careers_page() throws Throwable {
//	    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//	    homePage.naviteToCarrersPage();
//	}
	
	@And("^I'm in the Careers page$")
	public void i_at_Careers_page() throws Throwable {
	    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	    homePage.naviteToCarrersPage();
	}
	
	@When("^I navigate to Careers page$")
	public void i_navigate_to_Careers_page() throws Throwable {
	    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	    homePage.naviteToCarrersPage();
	}
	
	@When("^I click in '(.+)'$")
	public void i_click_in_location(String location) throws Throwable {
	    CareerPage career = PageFactory.initElements(driver, CareerPage.class);
	    career.navigateToJobPositionPage(location);
	}

	@Then("^I should see '([1-9]+[0-9]*)' job locations$")
	public void i_should_see_totalJobLocations_job_locations(int jobLocationAmount) throws Throwable {
	    CareerPage careerPage = PageFactory.initElements(driver, CareerPage.class);
	    int currentQuantity = careerPage.cityQuantity();
	    assertEquals(jobLocationAmount, currentQuantity);
	}
}
