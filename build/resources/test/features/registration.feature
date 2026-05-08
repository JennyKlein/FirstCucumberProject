Feature: Registration

  @registration
  Scenario: Successful registration

    Given User launcher Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Sign Up link
    And User enters data
    And Check the box to agree to the terms of use and privacy policy
    And User click on Yalla button

    Then User verifies that the success message is displayed
    And User closes browser


  @existingUserRegistration
  Scenario: Registration with already used data

    Given User launcher Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Sign Up link
    And User enters data that already exists
    And Check the box to agree to the terms of use and privacy policy
    And User click on Yalla button

    Then User receives a message that the user already exists
    And User closes browser