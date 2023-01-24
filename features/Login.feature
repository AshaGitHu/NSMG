Feature: Application Login

Scenario Outline: Home page default login
Given user is on landing page
When user login into application with username and password
Then Home page is populated
And Articles are displayed