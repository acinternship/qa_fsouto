package com.avenuecode.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(className = "arrow-down")
	private WebElement navigationArrow;
	
	@FindBy(className = "careers-div")
	private WebElement careerContent;
	
	public void naviteToCarrersPage(){
		navigationArrow.click();
		careerContent.click();
	}
}
