
@profile
Feature: Test profile update functionality

  @profile1
  Scenario Outline: Verify if age gets updated successfully
    Given user navigates to "BuggyCar" url
    When user enters <username> and <password>
    And user clicks on "login" button
    Then verify if "hiUser" is displayed
    Then verify navigation to "profile" page
    Then user updates name field as "Random"
    And user clicks on "logout" button
    
    Examples: 
      | username  						| password 		|
      | Testerjustin          | Test@123er  | 

