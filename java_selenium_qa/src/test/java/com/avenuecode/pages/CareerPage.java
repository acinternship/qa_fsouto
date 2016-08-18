package com.avenuecode.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class CareerPage {
	@FindBys({
		@FindBy(className = "city-item")
	})
	private List<WebElement> cityItems;
	
	public int cityTotalCount(){
		int totalCount = cityItems.size();
		return totalCount;
	}
}
