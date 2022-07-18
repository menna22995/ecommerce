@smoke
  Feature: change currency

    Scenario: F03=currencies | users could change currency in their accounts
      Given user navigates login page
      When user enter valid email
      And  user enter valid pass
      And  user enter login button
      And  user go to dropdown list on the top left of home page
      Then user elect Euro currency