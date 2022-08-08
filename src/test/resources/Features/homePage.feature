
@homePage
Feature: Test home page
   
  @homePage1  
  Scenario Outline: Verify if home page loads and navigates properly
    Given user navigates to "BuggyCar" url
    When user enters <username> and <password>
    And user clicks on "login" button
    Then verify if "hiUser" is displayed
    Then verify navigation to "model" page
    Then verify navigation to "home" page
    And user clicks on "logout" button
    
    Examples: 
      | username  						| password 		|
      | Testerjustin          | Test@123er  |  
