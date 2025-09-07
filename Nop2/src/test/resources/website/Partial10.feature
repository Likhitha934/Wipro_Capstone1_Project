Feature: Search Functionality

  Scenario: Searching for a product with a partial keyword
    Given the user is on the home page
    When the user enters the partial keyword "cam" into the search bar
    And clicks the search button
    Then a product with the title "Camera" should be displayed in the search results
