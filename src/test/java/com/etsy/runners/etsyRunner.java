package com.etsy.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/etsy/search.feature",
        glue = "com/etsy/stepdefenitions",
        dryRun = false,
        tags="@scenariooutline or @regression2",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)


public class etsyRunner {
}
