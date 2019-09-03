Feature: As a user
  I want to search a news article for similar information
  so that I can confirm that the news article is valid

  Scenario: Open guardian news article
    Given I navigate to the guardian page
    When I select news from the menu
    And I select the news making headlines
    Then I could read the news article making headline
    And I should be able to see the main information in the news

  Scenario: Check the main information in the news using google resource
    Given I navigate to the google
    When I am searching for news from the menu
    Then I should see a list of other sources with similar information
    And I could read the news article making headline from other source
    And I could confirm that the news article is valid