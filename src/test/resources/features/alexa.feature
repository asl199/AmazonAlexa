Feature: Assert Alexa in the cart

  Scenario: Customer searches for "Alexa" and selects third option for purchase
    Given the user navigates to "https://www.amazon.com/"
    And searches for "Alexa"
    And navigate to the second page
    And selects the third item
    Then user should be able to add it to the cart