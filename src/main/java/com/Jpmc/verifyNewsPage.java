package com.Jpmc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 22/06/2017.
 */
public class verifyNewsPage {

    WebDriver driver;

    public verifyNewsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Web Elements for create a note + add title and delete note.

    @FindBy(xpath = "//*[@id=\"top\"]/div[6]/div/div/div[2]/div[3]/button/span[2]")
    private WebElement closeCookie;

    @FindBy(linkText = "News")
    private WebElement newsButton;

    @FindBy(xpath = "//*[@id=\"brexit\"]/div/header/div/a/h2")
    private WebElement newsHeadline;

    @FindBy(xpath = "html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]")
    private WebElement DoneBtn;

    // Headline news message
    @FindBy(xpath = "//*[@id=\"brexit\"]/div/div/div/ul/li[1]/div/div/a")
    private WebElement headLineMessage;

    @FindBy(css = "#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input")
    private WebElement searchField;

    @FindBy(css = "#tsf > div:nth-child(2) > div > div.FPdoLc.VlcLAe > center > input.gNO89b")
    private WebElement clickSearchBtn;


    public void clickCookie() {
        closeCookie.click();

    }

    public void clickNews() {
        newsButton.click();

    }

    public void getHeadline() {
        newsHeadline.getText();
        System.out.println("Headline Title = " + newsHeadline.getText());
    }

    public void headLineBody() {
        headLineMessage.getText();
        System.out.println("Headline Title = " + headLineMessage.getText());
    }

    public void enterGoogleText(String mySearchWord) {
        searchField.sendKeys(mySearchWord);
        clickSearchBtn.click();

    }

}


