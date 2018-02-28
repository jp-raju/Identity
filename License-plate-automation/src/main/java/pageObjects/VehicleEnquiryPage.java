package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleEnquiryPage extends PageBase {
	
	@FindBy(id="Vrm")
	private WebElement regNumTextbox;
	
	@FindBy(name="Continue")
	private WebElement continueButton;
	
	public VehicleEnquiryPage(){
		super();
	}
	
	public VehicleEnquiryPage enterRegistrationNumber(String number){
		waitForElement(regNumTextbox).sendKeys(number);
		return this;
	}
	
	public VehicleInformationPage clickContinueButton(){
		waitForElement(continueButton).click();
		return new VehicleInformationPage();
	}
}
