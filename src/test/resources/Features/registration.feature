
@Registration
Feature: Test registration functionality

  @Registration1
  Scenario: Verify registration of new customer
    Given user navigates to "BuggyCarRegistration" url
    When user fills all the required fields
    And user clicks on "register" button
    Then verify if "userCreationMessage" is displayed