@smoke
  Feature: Wishlist feature
    Scenario: user can add item to wishlist
      Given user slecet product
      When user goto product page then tab to wishlist button
      Then massage added to wishlist will appear
