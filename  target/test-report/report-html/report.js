$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/verifyNews.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to validate news article from guardian news website",
  "description": "on similar resources, so that I can confirm that the news article is not FAKE news",
  "id": "as-a-user,-i-want-to-validate-news-article-from-guardian-news-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8300189889,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Launch guardian news websiite",
  "description": "",
  "id": "as-a-user,-i-want-to-validate-news-article-from-guardian-news-website;launch-guardian-news-websiite",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the guardian news website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the news link from the menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I select the headlines news",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be able to see the news page of that headline",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should be able to copy and save to file the headline of the news",
  "keyword": "And "
});
formatter.match({
  "location": "verifyNewsTest.i_navigate_to_the_guardian_news_website()"
});
formatter.result({
  "duration": 20763949252,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_click_on_the_news_link_from_the_menu()"
});
formatter.result({
  "duration": 9072564278,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_select_the_headlines_news()"
});
formatter.result({
  "duration": 19172294461,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_should_be_able_to_see_the_news_page_of_that_headline()"
});
formatter.result({
  "duration": 105974774,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_should_be_able_to_copy_and_save_to_file_the_headline_of_the_news()"
});
formatter.result({
  "duration": 984508603,
  "status": "passed"
});
formatter.after({
  "duration": 48964,
  "status": "passed"
});
formatter.before({
  "duration": 6525691843,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "To validate the headline news retrieved from guardian news with other resources on google",
  "description": "",
  "id": "as-a-user,-i-want-to-validate-news-article-from-guardian-news-website;to-validate-the-headline-news-retrieved-from-guardian-news-with-other-resources-on-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I navigate to google website",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I search for the headline news from the guardian site",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should see a list of other sources with similar news details",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I am able to confirm that the news article Fake or not",
  "keyword": "And "
});
formatter.match({
  "location": "verifyNewsTest.i_navigate_to_google_website()"
});
formatter.result({
  "duration": 1816422746,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_search_for_the_headline_news_from_the_guardian_site()"
});
formatter.result({
  "duration": 3718009472,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_should_see_a_list_of_other_sources_with_similar_news_details()"
});
formatter.result({
  "duration": 2143140137,
  "status": "passed"
});
formatter.match({
  "location": "verifyNewsTest.i_am_able_to_confirm_that_the_news_article_Fake_or_not()"
});
formatter.result({
  "duration": 2605988297,
  "status": "passed"
});
formatter.after({
  "duration": 45234,
  "status": "passed"
});
});