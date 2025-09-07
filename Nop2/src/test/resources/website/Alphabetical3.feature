Feature: Product Sorting

Scenario: Sort products by name in alphabetical order
Given the user is on the notebooks1 category page
When the user selects "Name: A to Z" from the sort dropdown
Then the products should be listed in ascending alphabetical order