package com.avenuecode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(className = "arrow-down")
	private WebElement navigationArrowStart;
	
	@FindBy(className = "careers-div")
	private WebElement careerContent;

	@FindBy(className = "talent-div")
	private WebElement talentContent;

	@FindBy(className = "cd-next")
	private WebElement navigationArrowNext;
	
	@FindBy(className = "ac-academy-home-button")
	private WebElement academyContent;
	
	@FindBy(tagName = "body")
	private WebElement bodyContent;
	
	public void navigateToCarrersPage(){
		navigationArrowStart.click();
		careerContent.click();
	}

	public void navigateToAcademyPage() {
		navigationArrowStart.click();
		navigationArrowNext.click();
		navigationArrowNext.click();
		academyContent.click();
	}

	public void navigateToTalentPage() {
		navigationArrowStart.click();
		navigationArrowNext.click();
		talentContent.click();
		
	}
	
	public void navigateToContactPage() {
		navigationArrowStart.click();
		navigationArrowNext.click();
		navigationArrowNext.click();
		navigationArrowNext.click();
		WebElement footerContent = bodyContent.findElement(By.className("footer-bg"));
		footerContent.findElement(By.className("home-page-contact-link")).click();
	}

}
