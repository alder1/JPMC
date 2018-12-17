Feature: As a user of Google Keep app, I want to login to the application

  Background:
    Given I navigate to the Landing page

  Scenario:

    When I enter login successfully
    And I click on the login button
    Then I should login successfully


  Scenario Outline: Check user could login with invalid username credentials

    When I enter "<username>" and "<password>"
    Then I should see "<text>"


    Examples:
      | username              | password    | text    |
#      | mustie16@hotmail.com  | angel2010   | Account |
#      | olu.adesote@yahoo.com | password123 | Account |
#      | mustie16@gmail.com    | angel2010   | Wrong   |
