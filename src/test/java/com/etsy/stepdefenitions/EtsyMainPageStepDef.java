package com.etsy.stepdefenitions;

import com.etsy.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class EtsyMainPageStepDef {
    WebDriver driver= DriverHelper.getDriver();
    MainPage mainPage=new MainPage(driver);

    @When("User searchs for {string} for Etsy WebPage")
    public void user_searchs_for_for_etsy_web_page(String searchItem) {
        mainPage.validateSearchFunctionality(searchItem);


    }
    @Then("User validates the title {string} from Etsy")
    public void user_validates_the_title_from_etsy(String title) {
        Assert.assertEquals(title,driver.getTitle().trim());

    }
}
