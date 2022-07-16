@smoke
  Feature: users could register with new accounts
     Scenario: new user could register with valid data successfully
       Given user go to register page
    When user select gender type
   And user enter first name "automation"
     And user enter last name "tester"
    And user enter day of birth
       And user enter month of birth
       And user enter year of birth
    And user enter email "test@example.com" field
    And user fills Password field "P@ssw0rd"
     And user confirm passsword field"P@ssw0rd"
    And user clicks on register button
    Then success message is displayed