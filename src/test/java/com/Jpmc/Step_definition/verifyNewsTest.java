package com.Jpmc.Step_definition;

import com.Jpmc.DriverInstance;
import com.Jpmc.verifyNewsPage;
import cucumber.api.java.en.*;

import java.util.ResourceBundle;


/**
 * Created by musti on 12/10/2017.
 */
public class verifyNewsTest extends DriverInstance{
    ResourceBundle config = ResourceBundle.getBundle("config");
    verifyNewsPage verifyNP = new verifyNewsPage(driver);

    @Given("^I navigate to the guardian page$")
    public void i_navigate_to_the_guardian_page() throws Throwable {
        driver.get(config.getString("URL"));
        verifyNP.clickCookie();
        verifyNP.clickNews();
        verifyNP.getHeadline();
        verifyNP.headLineBody();




    }

    @When("^I select news from the menu$")
    public void i_select_news_from_the_menu() throws Throwable {


    }

    @When("^I select the news making headlines$")
    public void i_select_the_news_making_headlines() throws Throwable {


    }

    @Then("^I could read the news article making headline$")
    public void i_could_read_the_news_article_making_headline() throws Throwable {

    }

    @Then("^I should be able to see the main information in the news$")
    public void i_should_be_able_to_see_the_main_information_in_the_news() throws Throwable {

    }

    @Given("^I navigate to the google$")
    public void i_navigate_to_the_google() throws Throwable {
        driver.get(config.getString("URL2"));

    }

    @When("^I am searching for news from the menu$")
    public void i_am_searching_for_news_from_the_menu() throws Throwable {
        //verifyNP.enterGoogleText("pls search for my fake news");
    }

    @Then("^I should see a list of other sources with similar information$")
    public void i_should_see_a_list_of_other_sources_with_similar_information() throws Throwable {

    }

    @Then("^I could read the news article making headline from other source$")
    public void i_could_read_the_news_article_making_headline_from_other_source() throws Throwable {

    }

    @Then("^I could confirm that the news article is valid$")
    public void i_could_confirm_that_the_news_article_is_valid() throws Throwable {

    }


}
