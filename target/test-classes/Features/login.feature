Feature: As a user of Google Keep app, I want to login to the application

  Scenario:
            Given I navigate to the Landing page
            When I enter my "username" and "password"
            And I click on the login button
            Then I should login successfully
