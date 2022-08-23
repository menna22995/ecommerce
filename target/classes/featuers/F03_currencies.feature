@smoke
  Feature: change currency

    Scenario: F03=currencies | users could change currency in their accounts
      Given user navigates login page
      When user enter valid email
      And  user enter valid pass
      And  user enter login button
      And  user go to dropdown list on the top left of home page
      Then user select Euro currency


      Scenario:2 user change currancy in second product
        And  user go to dropdown list on the top left
        Then user select Euro currency in second product

        Scenario:3 user change currancy in Third product
          Then user select Euro currency in third product

          Scenario: 4 user change currancy in fourth product
            Then user select Euro currency in fourth product