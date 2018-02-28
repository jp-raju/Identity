$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/features/Check_Vehicle_Details.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Vehicle details",
  "description": "",
  "id": "verify-vehicle-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify vehicle details",
  "description": "",
  "id": "verify-vehicle-details;verify-vehicle-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user visits DVLA home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Start Now button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user is navigated to vehicle enquiry page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters Registration number \"\u003cRegistration number\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks Continue button on vehicle enquiry page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is able to see vehicle information on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user confirms the vehicle information is correct",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user is able to see vehicle details on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user verifies make of the vehicle matches with \"\u003cVehicle Make\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user verifies colour of the vehicle matches with \"\u003cVehicle Colour\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verifies registration date of the vehicle matches with \"\u003cRegistration Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user verifies fuel type  of the vehicle matches with \"\u003cFuel Type\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "verify-vehicle-details;verify-vehicle-details;",
  "rows": [
    {
      "cells": [
        "Registration number",
        "Vehicle Make",
        "Vehicle Colour",
        "Registration Date",
        "Fuel Type"
      ],
      "line": 18,
      "id": "verify-vehicle-details;verify-vehicle-details;;1"
    },
    {
      "cells": [
        "EO12GCU",
        "LAND ROVER",
        "Black",
        "March 2012",
        "Diesel"
      ],
      "line": 19,
      "id": "verify-vehicle-details;verify-vehicle-details;;2"
    },
    {
      "cells": [
        "EK53FSV",
        "Ford",
        "Silver",
        "october 2003",
        "Diesel"
      ],
      "line": 20,
      "id": "verify-vehicle-details;verify-vehicle-details;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Verify vehicle details",
  "description": "",
  "id": "verify-vehicle-details;verify-vehicle-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user visits DVLA home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Start Now button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user is navigated to vehicle enquiry page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters Registration number \"EO12GCU\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks Continue button on vehicle enquiry page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is able to see vehicle information on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user confirms the vehicle information is correct",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user is able to see vehicle details on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user verifies make of the vehicle matches with \"LAND ROVER\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user verifies colour of the vehicle matches with \"Black\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verifies registration date of the vehicle matches with \"March 2012\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user verifies fuel type  of the vehicle matches with \"Diesel\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepDefinition.user_visits_dvla_home_page()"
});
formatter.result({
  "duration": 8971412103,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.user_clicks_on_start_now_button()"
});
formatter.result({
  "duration": 2610041125,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.user_is_navigated_to_vehicle_enquiry_page()"
});
formatter.result({
  "duration": 43345401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EO12GCU",
      "offset": 33
    }
  ],
  "location": "CommonStepDefinition.user_enters_registration_number_something(String)"
});
formatter.result({
  "duration": 312083030,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.user_clicks_continue_button_on_vehicle_enquiry_page()"
});
formatter.result({
  "duration": 939000072,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.userIsAbleToSeeVehicleInformationOnThePage()"
});
formatter.result({
  "duration": 84450142,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.userClicksOnYesRadioButtonToConfirmTheVehicle()"
});
formatter.result({
  "duration": 1151521429,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.user_is_able_to_see_vehicle_details_on_the_page()"
});
formatter.result({
  "duration": 63055985,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LAND ROVER",
      "offset": 48
    }
  ],
  "location": "CommonStepDefinition.user_verifies_make_of_the_vehicle_matches_with_something(String)"
});
formatter.result({
  "duration": 154996872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Black",
      "offset": 50
    }
  ],
  "location": "CommonStepDefinition.user_verifies_colour_of_the_vehicle_matches_with_something(String)"
});
formatter.result({
  "duration": 172064365,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "March 2012",
      "offset": 61
    }
  ],
  "location": "CommonStepDefinition.userVerifiesRegistrationDateOfTheVehicleMatchesWithSomething(String)"
});
formatter.result({
  "duration": 156975397,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Diesel",
      "offset": 54
    }
  ],
  "location": "CommonStepDefinition.userVerifiesFuelTypeOfTheVehicleMatchesWithSomething(String)"
});
formatter.result({
  "duration": 148940691,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify vehicle details",
  "description": "",
  "id": "verify-vehicle-details;verify-vehicle-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user visits DVLA home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Start Now button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user is navigated to vehicle enquiry page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters Registration number \"EK53FSV\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks Continue button on vehicle enquiry page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is able to see vehicle information on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user confirms the vehicle information is correct",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user is able to see vehicle details on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user verifies make of the vehicle matches with \"Ford\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user verifies colour of the vehicle matches with \"Silver\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verifies registration date of the vehicle matches with \"october 2003\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user verifies fuel type  of the vehicle matches with \"Diesel\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepDefinition.user_visits_dvla_home_page()"
});
formatter.result({
  "duration": 494071605,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.user_clicks_on_start_now_button()"
});
formatter.result({
  "duration": 550907729,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.user_is_navigated_to_vehicle_enquiry_page()"
});
formatter.result({
  "duration": 49541879,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EK53FSV",
      "offset": 33
    }
  ],
  "location": "CommonStepDefinition.user_enters_registration_number_something(String)"
});
formatter.result({
  "duration": 248973304,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.user_clicks_continue_button_on_vehicle_enquiry_page()"
});
formatter.result({
  "duration": 1655527501,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.userIsAbleToSeeVehicleInformationOnThePage()"
});
formatter.result({
  "duration": 72445261,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.userClicksOnYesRadioButtonToConfirmTheVehicle()"
});
formatter.result({
  "duration": 813876337,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinition.user_is_able_to_see_vehicle_details_on_the_page()"
});
formatter.result({
  "duration": 159339535,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ford",
      "offset": 48
    }
  ],
  "location": "CommonStepDefinition.user_verifies_make_of_the_vehicle_matches_with_something(String)"
});
formatter.result({
  "duration": 292398289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Silver",
      "offset": 50
    }
  ],
  "location": "CommonStepDefinition.user_verifies_colour_of_the_vehicle_matches_with_something(String)"
});
formatter.result({
  "duration": 286102946,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "october 2003",
      "offset": 61
    }
  ],
  "location": "CommonStepDefinition.userVerifiesRegistrationDateOfTheVehicleMatchesWithSomething(String)"
});
formatter.result({
  "duration": 254899443,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Diesel",
      "offset": 54
    }
  ],
  "location": "CommonStepDefinition.userVerifiesFuelTypeOfTheVehicleMatchesWithSomething(String)"
});
formatter.result({
  "duration": 271013978,
  "status": "passed"
});
});