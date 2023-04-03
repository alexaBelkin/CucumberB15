package com.weborder.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*

    These are interview question:
    *Runner class is a way to run your all feature files from here.Regression,smoke and etc ...
    *@RunWith--> Annotation comes from Junit and it executes the feature file steps
    *@CucumberOptions-->Annotation that have some keyword
     **features-->this is a location of the feature files(This one should be "Content root")
     **glue-->This is a location of step definition file.(this one should be "SOURCE ROOT")
     **dryRun-->This is a way to get snips without executing the whole steps from beginning
     **tags--->is a way to specialize your scenario for the specific tag(regression,smoke)(filtration)
     **plugIn--->Is a way to integrate specific condition for the keyword.It is mostly used for report card.
     */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder", //content root(right click ->copy path
        glue = "com/weborder/stepdefinitions", //source root
        dryRun = false, //getting snips without executing
        tags="@regression3", // @regression and @alexa and refers to one scenario //or refers to multiple scenarios
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}



)

public class WebOrderRunner {

}
