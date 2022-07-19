@smoke
Feature: invalid_Login | users could use login functionality to use their accounts
Scenario: user could login with invalid email and password
Given user navigate login page
When user login with "invalid" "test@example.com"
And user login with invalid"P@ssw0rd"
And user presss on login button
Then user could not login to the system