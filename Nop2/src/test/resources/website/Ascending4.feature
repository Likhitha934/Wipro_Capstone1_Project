Feature: Product Sorting

Scenario: Sorting products by price low to high
 Given the user is on the notebooks category page
 When the user selects "Price: Low to High" from the sort by dropdown
Then the products should be sorted by price in ascending order
