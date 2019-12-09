@homeEduma
Feature: validating the homepage

Scenario: Checking all the icons in the homepage
Given Launch the LMS Url "http://sethuonline.com/lms/"
Then Click on home
And Click on courses 
When  Check for courses page is opened
And Click on Home
Given Click on features
Then Check for features page is opened
Given Enter text in the search bar
Then Click on Search button
And Press home in all courses page
Given Click on Education word press theme
Then press return to home
Given Click on Best courses for photography
Then press home in collections page
Given Mouse hover on image introduction learn press -lms plugin
Then Click on READ MORE
When General Page is opened
Then click on home in General page
Given Click on view all button
Then click on home in allcourses page
