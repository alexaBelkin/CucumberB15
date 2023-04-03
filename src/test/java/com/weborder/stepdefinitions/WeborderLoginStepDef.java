package com.weborder.stepdefinitions;

import com.weborder.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WeborderLoginStepDef {
    WebDriver driver= DriverHelper.getDriver();

    LoginPage loginPage=new LoginPage(driver);


    @When("User provide {string} and {string} for Weborder")
    public void user_provide_and_for_weborder(String username, String password) {
       loginPage.validatePositiveLogin(username, password);

    }
    @Then("User validates {string} from homepage")
    public void user_validates_from_homepage(String title) {
     Assert.assertEquals(title,loginPage.validateTitle(driver));

    }
    @Then("User validates {string} error message")
    public void user_validates_error_message(String expectedError) {
        Assert.assertEquals(expectedError,loginPage.validateErrorMesage());

    }
}
