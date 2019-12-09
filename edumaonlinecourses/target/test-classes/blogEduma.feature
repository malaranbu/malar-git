@blogEduma
Feature: Validating blog page

Scenario: Checking for all elements in the blog page
Given Launch the lms url "http://sethuonline.com/lms/"
Then Click on blog
When Check for blog page is opened
Given Click on image
Then Check for Business page is opened
And Click on blog in business page
Given Click on admin
Then Check for admin page is opened
And Click on blog
Then Click on comment
When Check for comment section
Given Click on Blog in new page
Then Click on read more button
When Business page is opened
And Click on blog in new page