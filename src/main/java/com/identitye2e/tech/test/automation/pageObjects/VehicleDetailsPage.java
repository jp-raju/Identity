package com.identitye2e.tech.test.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleDetailsPage extends PageBase{
	@FindBy(css="h1 .reg-mark")
	private WebElement registrationBanner;
	
	@FindBy(css="li.list-summary-item:nth-child(1) span strong")
	private WebElement vehicleMake;
	
	@FindBy(css="li#UKRegistrationDateDummyDateV5CMatch span strong")
	private WebElement vehicleRegistrationDate;
	
	@FindBy(css="li.list-summary-item:nth-of-type(9) span strong")
	private WebElement vehicleColour;
	
	@FindBy(css="li#FuelType span strong")
	private WebElement vehicleFuelType;

	public VehicleDetailsPage(){
		super();
	}

	public boolean isVehicleDetailsPageDisplayed(){
		return isElementDisplayed(registrationBanner);
	}
	
	public String getVehicleMake(){
		return waitForElement(vehicleMake).getText();
	}
	
	public String getVehicleColour(){
		return waitForElement(vehicleColour).getText();
	}
	
	public String getVehicleRegistrationDate(){
		return waitForElement(vehicleRegistrationDate).getText();
	}
	
	public String getVehicleFueltype(){
		return waitForElement(vehicleFuelType).getText();
	}
}
