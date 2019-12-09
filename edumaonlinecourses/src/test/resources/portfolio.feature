@portfolio
Feature: Validating the portfolio page


Scenario: Checking the elements in the portfolio page
Given Launch the LMS url "http://sethuonline.com/lms/"
Then Click on the Portfolio
When Check for the portfolio page is opened
And Click on the home
Given Click on the courses
Then Click on the Books
Given mouse hover on the first image
Then Click on the homework
And Check for the product description page
When Click on the home in the product description page
Given Click on portfolio again
Then Again mouse over on first image
And Click on courses on image
When Check for project type courses page
Given Click on back button of the driver
Then Click on books
Given Mouse hover on the image
Then Click on opened books
When Check for the opened books page
And Click home in the page

