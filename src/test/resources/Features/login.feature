
@login
Feature: Test Login functionality
      
   @login1   
   Scenario Outline: Check login is successful with valid credentials
    Given user navigates to "BuggyCar" url
    When user enters <username> and <password>
    And user clicks on "login" button
    Then verify if "profile" is displayed
    And user clicks on "logout" button
    
    Examples: 
      | username  						| password 		|
      | Testerjustin          | Test@123er  |
      
    #@login2  
    #Scenario Outline: Check proper error message is displayed for invalid credentials
    #Given user navigates to "BuggyCar" url
    #When user enters <username> and <password>
    #And user clicks on "login" button
    #Then  verify if "profile" is displayed
    #
    #Examples: 
      #| username  						| password 	 |
      #| Testerjustin          | Test@13er  | 
      

