package com.smartBear.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class SmartBearHook {
    public WebDriver driver= DriverHelper.getDriver();

    @Before
    public void setup(){
        driver.get(ConfigReader.readProperty("smartBearUrl"));
    }
    @After
    public void tearsDown(Scenario scenario){
        BrowserUtils.getScreenShotForCucumber(driver,scenario);
       // driver.quit();
    }
}
