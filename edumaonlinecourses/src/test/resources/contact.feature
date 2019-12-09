@contactEduma
Feature: Validating the contact page


Scenario: Checking all the elements in contact page
Given Launch the webdriver url "http://sethuonline.com/lms/"
Then Click on the contact
When Check for contact page is opened
Given Enter the name "Abi"
When Enter the Email "abi@gmail.com"
Then Enter the Subject "hi"
And Enter the message "nice books"
Given Click on submit button