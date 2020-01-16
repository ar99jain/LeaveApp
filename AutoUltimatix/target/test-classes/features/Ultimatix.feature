Feature: Login to Ultimatix

Scenario: Display ultimatix Home Page with Default Login Process
Given User is able access the Ultimatix url
When User login to ultimatix with correct userId
And with correct Password
Then User should be able to login successfully and ultimatix Home page should display



