@shopEduma
Feature: Validating the Shop page

Scenario: Ordering a product in the shop page
Given Launch the LMS url "http://sethuonline.com/lms/"
Then Click on the Shop
And Check for the Shop page is opened
Given Click on home in the shop page
When Click on Shop
Then Select sort by popularity in the Drop down
Given Click on cup princely break
Then Product description page should open
When Click on add to cart button
And Click on view cart button
Given Click on proceed to checkout
Then Enter the first name "malar"
When Enter the last name "anbu"
And Enter the company name "ABC"
Given Select the country as "United kingdom (UK)"
Then Enter the First line address "swallow court"
When Enter the second line address "Gants hill"
And Enter the town as "Ilford"
Then Enter the country as "United Kingdom"
When Enter the postcode "ig26tu"