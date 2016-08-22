package com.avenuecode;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


import org.openqa.selenium.support.PageFactory;

import com.avenuecode.pages.HomePage;

public class NavigationSteps {
	@Given("^I access the 'Academy Page'$")
	public void i_access_the_Academy_Page() throws Throwable {
		HomePage homePage = PageFactory.initElements(CareerSteps.driver, HomePage.class);
	    homePage.naviteToAcademyPage();
	}

	@Then("^I should be in the Contact page$")
	public void i_should_be_in_the_Contact_page() throws Throwable {
		assertEquals(CareerSteps.driver.getCurrentUrl(), "https://www.avenuecode.com/contact#contact-form");
	}

	
}
