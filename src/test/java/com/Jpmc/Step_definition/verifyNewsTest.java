package com.Jpmc.Step_definition;

import com.Jpmc.DriverInstance;
import com.Jpmc.verifyNewsPage;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ResourceBundle;


public class verifyNewsTest extends DriverInstance {
    ResourceBundle config = ResourceBundle.getBundle("config");
    verifyNewsPage verifyNP = new verifyNewsPage(driver);

    @Given("^I navigate to the guardian page$")
    public void i_navigate_to_the_guardian_page() throws Throwable {
        driver.get(config.getString("URL"));

    }

    @When("^I select news from the menu$")
    public void i_select_news_from_the_menu() throws Throwable {

        verifyNP.clickCookie();
        verifyNP.clickNews();
    }

    @When("^I select the news making headlines$")
    public void i_select_the_news_making_headlines() throws Throwable {
        verifyNP.clickHeadlineNews();

    }

    @Then("^I could read the news article making headline$")
    public void i_could_read_the_news_article_making_headline() throws Throwable {
        //verifyNP.closeGuardianSupport();
        System.out.println(verifyNP.getHeadline());
    }

    @Then("^I should be able to see the main information in the news$")
    public void i_should_be_able_to_see_the_main_information_in_the_news() throws Throwable {
        verifyNP.saveTextToFile();
        driver.close();
    }

    @Given("^I navigate to the google$")
    public void i_navigate_to_the_google() throws Throwable {
        driver.get(config.getString("URL2"));

    }

    @When("^I am searching for news from the menu$")
    public void i_am_searching_for_news_from_the_menu() throws Throwable {
        verifyNP.enterGoogleText();

    }

    @Then("^I should see a list of other sources with similar information$")
    public void i_should_see_a_list_of_other_sources_with_similar_information() throws Throwable {
        verifyNP.clickGoogleSearchBtn();
    }

    @Then("^I could confirm that the news article is valid$")
    public void i_could_confirm_that_the_news_article_is_valid() throws Throwable {
        Assert.assertTrue(verifyNP.countResult());
        driver.close();
    }


}
