package com.etsy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='search_query']")
    WebElement searchBox;

    public void validateSearchFunctionality(String text){
        searchBox.sendKeys(text, Keys.ENTER);
    }

}
