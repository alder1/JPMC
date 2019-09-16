package com.Jpmc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;



public class DriverInstance {

    public static WebDriver driver;

    //This will open the browser
    public void openBrowser() {
        ResourceBundle config = ResourceBundle.getBundle("config");

        config.getString("browser").equalsIgnoreCase("Chrome");
            System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver_76.0.exe");
            driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(config.getString("URL"));
        driver.manage().window().maximize();
    }
            //This will close browser
            public void closeBrowser(){
            driver.quit();
        }

}
