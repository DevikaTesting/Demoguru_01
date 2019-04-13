
#Sample Feature Definition Template
@tag
Feature: To test add tariff plan functionality

  @tag1
  Scenario: Add tariff details and get message
    Given The user is in add tariff plan page
    When the User type the form details
      | 100 | 200 | 300 | 400 | 500 | 600 | 700 |
    When Click the sumit button
    Then The user should see the success message
 
  @tag2
 Scenario: insert no values in fields and get alert
   Given The user is in add tariff plan page
   When Click the submit button
   Then the user sees alert message
   
   @tag3
   Scenario: the user see successful validation
   Given The user is in add tariff plan page
   When user fill the fields with invalid data
    | abc | abc | abc | abc | abc | abc | abc |
   Then the user see invalid input labels
 
    
  