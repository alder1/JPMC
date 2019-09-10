package com.Jpmc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


import java.nio.file.Paths;

import java.util.Scanner;

import static java.nio.file.Files.*;


public class verifyNewsPage {

    WebDriver driver;

    public verifyNewsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Web Elements

    @FindBy(xpath = "//*[@id='top']/div[6]/div/div/div[2]/div[3]/button/span[2]")
    private WebElement closeCookie;

    @FindBy(linkText = "News")
    private WebElement newsButton;

    @FindBy(xpath = "//a[@data-link-name='article']")
    private WebElement newsHeadline;

    @FindBy(xpath = "div[@class='engagement-banner__close']")
    private WebElement closeSupportTheGuardian;


    // Headline news message
    @FindBy(xpath = "//h1")
    private WebElement headLineMessage;

    @FindBy(css = "#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input")
    private WebElement searchField;

    @FindBy(css = "#tsf > div:nth-child(2) > div > div.FPdoLc.VlcLAe > center > input.gNO89b")
    private WebElement clickSearchBtn;

    @FindBy(xpath = "//h3")   //id = "resultStats"
    private WebElement searchResult;


    public void clickCookie() {
        closeCookie.click();

    }

    public void clickNews() {
        newsButton.click();

    }

    public void clickHeadlineNews() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(newsHeadline));
        Actions action = new Actions(driver);
        action.moveToElement(newsHeadline).click().perform();
    }

    public void closeGuardianSupport() {
        closeSupportTheGuardian.click();
    }

    public String getHeadline() {
        String headline = headLineMessage.getText();
        return headline;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public void enterGoogleText() {

        getSearchField().sendKeys(retrieveHeadline());
    }

    public void clickGoogleSearchBtn() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clickSearchBtn));
        Actions action = new Actions(driver);
        action.moveToElement(clickSearchBtn).click().perform();
    }

    public void saveTextToFile() {

        // This code will call the FileWriter class and save the retrieved text from 'copyText.getText' method & save the text to file specified.
        String textToSave = headLineMessage.getText();
        FileWriter myFileWriter = new FileWriter("NewsHeadline");
        myFileWriter.writeToFile(textToSave);
        myFileWriter.endFile();
    }
    // This code will retrieve text from the file and pass into the google text field on the web app.

    public String retrieveHeadline() {

        try {
            new Scanner(Paths.get("src/test/resources/NewsHeadline"));
        } catch (IOException e) {
            throw new RuntimeException("Could not find text file");
        }
        String retrieveText;
        try {
            retrieveText = new String(readAllBytes(Paths.get("src/test/resources/NewsHeadline")));
        } catch (IOException e) {
            throw new RuntimeException("Could not retrieve a Text");
        }

        return retrieveText;
    }

    public void countResult() {

        int result = driver.findElements(By.xpath("//h3")).size();
        System.out.println("Total search result displayed on google search is " + result);

        if (result >=5){
            System.out.println("*****This is an ORIGINAL news*****");
        }else{
            System.out.println("*****This is an FAKE news*****");

        }

    }
}