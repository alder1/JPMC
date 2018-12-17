package com.CucumberPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Musti on 14/11/2018.
 */
public class CurrentDate {

    public static String getCurentDate() {
        DateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        Date systemDate = new Date();
        String dateOfSystem = formatDate.format(systemDate);
        System.out.println(dateOfSystem);

        return dateOfSystem;
    }

}

