@britishTest
Feature: british airways registration


Scenario: british Airways registrationby filling all the mandatiry fields with registered user
Given launch british airways url "https://britishairways.com"
And click on the Registration link
Then check for the registration page is opened
Given enter the email id "malar.cse@gmail.com"
Then confirm the email id "malar.cse@gmail.com"
Given enter the password "v1n0thm@l@r"
Then confirm the same "v1n0thm@l@r"
Given Select the title "Mr"
And enter the first name 
Then enter the last name
When click on "Register with BA" Radio button
Given Click on Join Now button
Then Check for user already exist message







