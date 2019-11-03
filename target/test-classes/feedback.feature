@feedback
Feature: Filling the feedback page

Scenario: Filling the feedback page of british airways
Given launch british airways url "https://britishairways.com"
Then Click on the feedback image
And check for British Airways website feedback 
Given Click on the site feedback
Then Check for What was using the website like? Frame is opened
And Click on Like smiley
When Get text as please tell us more
Then Fill the text box with comments
Given Click the done button
Then Check for Good to know frame is opened
And click on done button



