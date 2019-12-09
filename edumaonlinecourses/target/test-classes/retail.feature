@retail
Feature: validating the retail page

Scenario: Checking all the elements in the retail page
Given Launch the web browser url "http://automationpractice.com/index.php"
Then click on Sign in button
When Create an account page opens
Given Enter the email address
Then Click on create an account button
When Your personal information page should open
Given Click on the"Mrs" radio button in the title
Then Enter Firstname
And Enter Last name
Given Enter the Emailid
Then Enter the Password 
