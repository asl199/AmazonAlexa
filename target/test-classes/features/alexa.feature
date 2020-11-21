Feature: Assert alexa in the cart

  Scenario: Customer searches for third option, from second page for Alexa and puts in cart
    Given the user navigates to "https://www.amazon.com/"
    And searches for "Alexa"
    And navigate to the second page
    And selects the third item
    Then user should be able to add it to the cart