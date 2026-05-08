Feature: Login

  @loginPositive

  Scenario: Successful login
    Given User launcher Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enters correct data
    And User clicks on Yalla button

    Then User verifies success message in displayed
    And User closes browser

  @wrongPassword

  Scenario Outline: Login with correct email and incorrect password
    Given User launcher Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enters correct email and incorrect password

      | email   | password   |
      | <email> | <password> |

    And User clicks on Yalla button

    Then User verifies error message in displayed
    And User closes browser
    Examples:
      | email             | password   |
      | test222@gmail.com | Test123451 |
      | test222@gmail.com | test12345! |
      | test222@gmail.com | tEST12345! |
      | test222@gmail.com | Еуые12345! |

  @wrongEmail

  Scenario Outline: Login with incorrect email and correct password
    Given User launcher Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enters incorrect email and correct password

      | email   | password |
      | <email> | <password> |

    And User clicks on Yalla button

    Then User verifies error message in displayed
    And User closes browser
    Examples:
      | email | password |
      |    test222@mail.com   |    Test12345!      |
      |    test22@gmail.com   |    Test12345!      |
      |    test111@gmail.com   |    Test12345!      |
      |    tes222@gmail.com   |    Test12345!      |