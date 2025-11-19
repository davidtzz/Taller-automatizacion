Feature: Flight Purchase
As a user I want to purchase a flight so that I can successfully book my trip

  Scenario: Successful flight purchase
    Given I am on the flight search page
    When I search for a flight and complete the payment form
    Then I can see the price displayed correctly and a confirmation message

  Scenario: Flight purchase with invalid fields
    Given I am on the flight search page
    When I submit the payment form with invalid data
    Then I can see an error message and my trip is not booked