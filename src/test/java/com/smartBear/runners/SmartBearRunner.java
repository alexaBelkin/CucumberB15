package com.smartBear.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SmartBear",
        glue = "com/smartBear/stepdef",
        dryRun = false,
        tags="@smartBearRegression2",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)

public class SmartBearRunner {

}
