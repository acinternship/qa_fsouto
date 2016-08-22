package com.avenuecode.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(className = "arrow-down")
	private WebElement navigationArrowStart;
	
	@FindBy(className = "careers-div")
	private WebElement careerContent;
	
	@FindBy(className = "cd-next")
	private WebElement navigationArrowNext;
	
	@FindBy(className = "ac-academy-home-button")
	private WebElement academyContent;

	public void naviteToCarrersPage(){
		navigationArrowStart.click();
		careerContent.click();
	}

	public void naviteToAcademyPage() {
		navigationArrowStart.click();
		navigationArrowNext.click();
		navigationArrowNext.click();
		academyContent.click();
	}
}
