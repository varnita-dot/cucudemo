Feature: Add to cart functionality

Background: Create an instance of AddtoCart page
Then Create instance of add to cart page


Scenario: Add product into the cart
Given User is on landing page
When User search "cucumber"
And Click on search button
Then Result should display with "cucumber"


Scenario: Add product into the cart
Given User is on landing page
When User search "Tomato"
And Click on search button
Then Result should display with "Tomato"

