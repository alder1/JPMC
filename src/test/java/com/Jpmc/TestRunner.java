package com.Jpmc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html: target/test-report/report-html",
        "json: target/test-report/report/report-json.json",
        "junit: target/test-report/report-xml.xml",},
        features = {"src\\test\\resources"})


//@CucumberOptions(features=".",tags="@sanity", dryRun = false, strict = false,
//        format = {"pretty", "html:target/cucumber-html-report", "json:target/report_example.json"})
public class TestRunner {
}


