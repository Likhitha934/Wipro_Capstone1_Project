Feature: Search Functionality

  Scenario: Searching for a product with a full keyword
    Given the user is on the home page
    When the user enters the full keyword "camera" into the search bar
    And clicks the search button