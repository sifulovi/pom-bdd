package com.ovi;


import com.ovi.helper.BrowserHelper;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by touhid on 29/05/2016.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "pretty", "html:reports/test-report",
                "json:reports/report.json"
        },
        features = {
                "classpath:features/"
        },
        glue = {
                "com.ovi.stepsDefinitions"
        },
        tags = {
                "@Login"

        }
)
public class CucumberRunnerTest {

    @BeforeClass
    public static void beforeClass() {
        BrowserHelper.setup();
    }
}
