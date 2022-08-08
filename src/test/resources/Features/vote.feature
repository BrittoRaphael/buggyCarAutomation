
@vote
Feature: Test vote functionality
      
  @vote1
  Scenario: Verify user is able to vote
    Given user navigates to "BuggyCarRegistration" url
    When user fills all the required fields
    And user clicks on "register" button
    Then verify if "userCreationMessage" is displayed
    When user enters username
    And user enters password
    And user clicks on "login" button
    Then verify if "profile" is displayed
    Then verify navigation to "home" page
    Then verify navigation to "model" page
    Then verify if "voteButton" is displayed
    And user checks the change in number of votes after voting
    And user clicks on "logout" button
     

  #@vote2
  #Scenario Outline: Verify proper message is displayed for users who have already voted
    #Given user navigates to "BuggyCar" url
    #When user enters <username> and <password>
    #And user clicks on "login" button
    #Then verify if "profile" is displayed
    #Then verify navigation to "model" page
    #Then verify if "votedMessage" is displayed
    #And user clicks on "logout" button
    #
    #Examples: 
      #| username  						| password 		|
      #| Testerbritto          | Test@123er  | 
