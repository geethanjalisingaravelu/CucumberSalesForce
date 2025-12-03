Feature: Login test cases

Scenario: Login with valid username and password T2

Given User launch the application
Given User is on "LoginPage"
Then User read the Data and enter the value to "username" "username"
Then User read the Data and enter the value to "password" "password"
Then User Click on "Login"
Then User Click on Verify Button "Verify"
Given User is on "HomePage"
Then User verify the page "Home" 