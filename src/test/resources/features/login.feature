Feature: Login

  Scenario: Successful login
    Given User launcher Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enters correct data
    And User clicks on Yalla button

    Then User verifies success message is displayed