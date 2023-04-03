package com.etsy.stepdefenitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

import java.sql.Driver;

public class etsyHook {
    WebDriver driver= DriverHelper.getDriver();
//    @Before
//    public void setup(){
//        driver.get(ConfigReader.readProperty("etsyurl"));
//    }
//    @After
//    public void tearsDown(Scenario scenario){
//        BrowserUtils.getScreenShotForCucumber(driver,scenario);
//        driver.quit();
//    }
}
