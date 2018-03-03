package com.identitye2e.tech.test.automation.stepDefinition;

import org.junit.Assert;

import com.identitye2e.tech.test.automation.common.Driver;
import com.identitye2e.tech.test.automation.pageObjects.DVLAHomePage;
import com.identitye2e.tech.test.automation.pageObjects.VehicleDetailsPage;
import com.identitye2e.tech.test.automation.pageObjects.VehicleEnquiryPage;
import com.identitye2e.tech.test.automation.pageObjects.VehicleInformationPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefinition {
	
	@When("^user visits DVLA home page$")
	public void user_visits_dvla_home_page() throws Throwable {
		Driver.getCurrentDriver().get("https://www.gov.uk/get-vehicle-information-from-dvla");
	}

	@When("^user enters Registration number \"([^\"]*)\"$")
	public void user_enters_registration_number_something(String registrationnumber) throws Throwable {
		new VehicleEnquiryPage().enterRegistrationNumber(registrationnumber);
	}

	@Then("^user is navigated to vehicle enquiry page$")
	public void user_is_navigated_to_vehicle_enquiry_page() throws Throwable {
		Assert.assertEquals("User is not navigated to vehicle enquiry page.","https://vehicleenquiry.service.gov.uk/", Driver.getCurrentDriver().getCurrentUrl());
	}

	@Then("^user is able to see vehicle details on the page$")
	public void user_is_able_to_see_vehicle_details_on_the_page() throws Throwable {
		Assert.assertTrue("Vehicle details are not displayed.", new VehicleDetailsPage().isVehicleDetailsPageDisplayed());
	}

	@And("^user clicks on Start Now button$")
	public void user_clicks_on_start_now_button() throws Throwable {
		new DVLAHomePage().clickStartNowButton();
	}

	@And("^user clicks Continue button on vehicle enquiry page$")
	public void user_clicks_continue_button_on_vehicle_enquiry_page() throws Throwable {
		new VehicleEnquiryPage().clickContinueButton();
	}

	@And("^user verifies make of the vehicle matches with \"([^\"]*)\"$")
	public void user_verifies_make_of_the_vehicle_matches_with_something(String vehiclemake) throws Throwable {
		Assert.assertEquals("Vehicle make on the page does not match with the expected vehicle make.",vehiclemake.toLowerCase(), new VehicleDetailsPage().getVehicleMake().toLowerCase());
	}

	@And("^user verifies colour of the vehicle matches with \"([^\"]*)\"$")
	public void user_verifies_colour_of_the_vehicle_matches_with_something(String vehiclecolour) throws Throwable {
		Assert.assertEquals("Vehicle colour on the page does not match with the expected vehicle colour.",vehiclecolour.toLowerCase(), new VehicleDetailsPage().getVehicleColour().toLowerCase());
	}
	
	@And("^user verifies registration date of the vehicle matches with \"([^\"]*)\"$")
    public void userVerifiesRegistrationDateOfTheVehicleMatchesWithSomething(String registrationdate) throws Throwable {
		Assert.assertEquals("Vehicle registration date on the page does not match with the expected vehicle registration date.",registrationdate.toLowerCase(), new VehicleDetailsPage().getVehicleRegistrationDate().toLowerCase());
    }

    @And("^user verifies fuel type  of the vehicle matches with \"([^\"]*)\"$")
    public void userVerifiesFuelTypeOfTheVehicleMatchesWithSomething(String fueltype) throws Throwable {
    	Assert.assertEquals("Vehicle fuel type on the page does not match with the expected fuel type.",fueltype.toLowerCase(), new VehicleDetailsPage().getVehicleFueltype().toLowerCase());
    }
	
	@When("^user confirms the vehicle information is correct$")
    public void userClicksOnYesRadioButtonToConfirmTheVehicle() throws Throwable {
        new VehicleInformationPage().confirmCorrectVehicle().clickContinueButton();
    }

    @Then("^user is able to see vehicle information on the page$")
    public void userIsAbleToSeeVehicleInformationOnThePage() throws Throwable {
    	Assert.assertTrue("Vehicle information not displayed.", new VehicleInformationPage().isVehicleInformationDisplayed());
    }
}
