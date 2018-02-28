package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleInformationPage extends PageBase{
	@FindBy(css="ul.list-summary")
	private WebElement vehicleDetailsSection;
	
	@FindBy(css="input#Correct_True + label")
	private WebElement yesRadioButton;
	
	@FindBy(name="Continue")
	private WebElement continueButton;
	
	public VehicleInformationPage(){
		super();
	}

	public VehicleInformationPage confirmCorrectVehicle(){
		waitForElement(yesRadioButton).click();
		return this;
	}
	
	public boolean isVehicleInformationDisplayed(){
		return isElementDisplayed(vehicleDetailsSection);
	}
	
	public VehicleDetailsPage clickContinueButton(){
		waitForElement(continueButton).click();
		return new VehicleDetailsPage();
	}
}