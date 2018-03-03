Feature: Verify Vehicle details

  Scenario Outline: Verify vehicle details
    When user visits DVLA home page
    And user clicks on Start Now button
    Then user is navigated to vehicle enquiry page
    When user enters Registration number "<Registration number>"
    And user clicks Continue button on vehicle enquiry page
    Then user is able to see vehicle information on the page
    When user confirms the vehicle information is correct
    Then user is able to see vehicle details on the page
    And user verifies make of the vehicle matches with "<Vehicle Make>"
    And user verifies colour of the vehicle matches with "<Vehicle Colour>"
    And user verifies registration date of the vehicle matches with "<Registration Date>"
    And user verifies fuel type  of the vehicle matches with "<Fuel Type>"

    Examples: 
      | Registration number | Vehicle Make | Vehicle Colour | Registration Date | Fuel Type |
      | EO12GCU             | LAND ROVER   | Black          | March 2012        | Diesel    |
      | EK53FSV             | Ford         | Silver         | october 2003      | Diesel    |
