@bookflight
Feature: book a flight in british airways


Scenario: booking a flight to france paris

Given launch british airways url "https://www.britishairways.com/travel/home/public/en_gb/"
And Click on the Book link
When Click on the Book a flight link
Then British Airways flights page should open
Given Click on the More destination link in Europe section
And Our cheapest fares from London in economy page should open
Given Enter the To as "France,Paris(PAR)"
And Click on One-way radio button
Then Select the Travel "First class"
Given Click on  Find lowest price button
Then No destination available should display 
