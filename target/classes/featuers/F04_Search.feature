@smoke
  Feature: search feature
    Scenario: F04=search  | users could search using product name
      Given user go to search filed
    When  tab to write product name
      And  user tab on search button
      Then user go to the product

      Scenario:2 users could search using sku

        When  tab to write sku
        And  user tab on search buttonn
        Then user go to the products