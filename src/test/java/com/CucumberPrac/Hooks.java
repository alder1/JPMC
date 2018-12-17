package com.CucumberPrac;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by musti on 13/09/2017.
 */
public class Hooks{
 DriverInstance di=new DriverInstance();
 @Before()
    public void setUpTest(){
     di.openBrowser();


    }

    @After
    public void tearDown(){
   // di.closeBrowser();


    }

}
