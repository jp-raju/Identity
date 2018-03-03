package com.identitye2e.tech.test.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DVLAHomePage extends PageBase {
	
	@FindBy(css="#get-started a")
	private WebElement startNowButton;
	
	public DVLAHomePage(){
		super();
	}
	
	public VehicleEnquiryPage clickStartNowButton(){
		waitForElement(startNowButton).click();
		return new VehicleEnquiryPage();
	}
}
