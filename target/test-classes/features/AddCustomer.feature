@tag
Feature: To Test add customer

  @tag1
  Scenario: To Test Customer ID Generation
    Given the user is in add customer page
    When the user fill in the customer details
      | guru | prasad | test@gmail.com | chennai | 60258 |
    When the user clicks the submit button
    Then the user should see the customer ID generated

  @tag2
  Scenario: to get alert message by validating an empty form
    Given the user in add customer page
    When the user details are blank
    When the user clicks submit button
    Then the user should see alert message

  @tag3
  Scenario: To test the add customer page with invalid data
    Given the user directs to add customer page
    When the user enters invalid data in the fields
      | 123 | 567 | testgmail | 1122 | test |
    Then the user should see error message
