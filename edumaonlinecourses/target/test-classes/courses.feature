@courseEduma
Feature: Validating Courses page

Scenario: Checking all the elements in the courses page
Given Launch the homepage "http://sethuonline.com/lms/"
Then Click on courses in the homepage
When Check for courses page opened
And Click on vertical icon
Then Click on horizontal icon
Given Enter the value in search box "test"
Then Mouse hover on first image
And Check for general page is opened
When Click on All courses
Given Click on Admin
Then Check for profile page is opened
And Click on courses in the profile page
When Click on introduction to learn press
Given Check for general page
Then Click on courses in the general page
