Feature: Login
Scenario:Logintest
verify that user is able to login on Facebook.com
Given User is on Facebook.com
When User Enters "username" and "password" 
And clicks on Login button
Then User is on Home Page




