Feature: Customer Login

  Scenario: Customer tries to login with invalid email and password
    Given an existing customer with invalid email and password
    When the customer attempts to log in
    Then the system returns a 403 Unauthorized status

  Scenario: Validation of error message for invalid login
    Given an existing customer with invalid email and password
    When the customer attempts to log in
    Then the system returns a 403 Unauthorized status
    And the error message is displayed to the customer