Feature: Change Currency Functionality
Scenario: Change currency to Euro
Given the user1 is on the home page
When the user selects "Euro" from the currency dropdown
Then the prices of all products should be displayed in Euros