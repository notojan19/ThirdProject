Feature: Login OrangeHRM

Scenario:Login with valid credentials
Given Open any Browser
And Navigate to Login page
When Userenters userID as "Admin" and password as "admin123" into the fields
And User clicks on Login button
Then Verify user is able to successfully login
