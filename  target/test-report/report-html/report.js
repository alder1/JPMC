$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/verifyNews.feature");
formatter.feature({
  "line": 1,
  "name": "As a user",
  "description": "I want to search a news article for similar information\r\nso that I can confirm that the news article is valid",
  "id": "as-a-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6796622950,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Open guardian news article",
  "description": "",
  "id": "as-a-user;open-guardian-news-article",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the guardian page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select news from the menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select the news making headlines",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I could read the news article making headline",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I should be able to see the main information in the news",
  "keyword": "And "
});
formatter.match({
  "location": "verifyNewsTest.i_navigate_to_the_guardian_page()"
});
formatter.result({
  "duration": 27715492237,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_select_news_from_the_menu()"
});
formatter.result({
  "duration": 18703781356,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_select_the_news_making_headlines()"
});
formatter.result({
  "duration": 18019449119,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_could_read_the_news_article_making_headline()"
});
formatter.result({
  "duration": 138525361,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_should_be_able_to_see_the_main_information_in_the_news()"
});
formatter.result({
  "duration": 934958982,
  "status": "passed"
});
formatter.after({
  "duration": 53161,
  "status": "passed"
});
formatter.before({
  "duration": 4698322527,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Check the main information in the news using google resource",
  "description": "",
  "id": "as-a-user;check-the-main-information-in-the-news-using-google-resource",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I navigate to the google",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I am searching for news from the menu",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should see a list of other sources with similar information",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I could confirm that the news article is valid",
  "keyword": "And "
});
formatter.match({
  "location": "verifyNewsTest.i_navigate_to_the_google()"
});
formatter.result({
  "duration": 1989781367,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_am_searching_for_news_from_the_menu()"
});
formatter.result({
  "duration": 2454477117,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_should_see_a_list_of_other_sources_with_similar_information()"
});
formatter.result({
  "duration": 2584775529,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_could_confirm_that_the_news_article_is_valid()"
});
formatter.result({
  "duration": 2371599074,
  "status": "passed"
});
formatter.after({
  "duration": 47565,
  "status": "passed"
});
});