Feature: Search Functionality

Scenario: Search for a product that does not exist
Given the user3 is on the home page
When the user searches for a product with a non-existent keyword
Then a "No products were found" message should be displayed