package com.weborder.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#Email")
    WebElement username;
    @FindBy(css = "#Password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInButton;
    @FindBy(xpath = "//div[contains(text(),'Failed')]")
    WebElement errorMesage;


    public void validatePositiveLogin(String username,String password){
        this.username.clear();
        this.username.sendKeys(username);
        this.password.clear();
        this.password.sendKeys(password);
        this.signInButton.click();
    }
    public String validateTitle(WebDriver driver){
        return driver.getTitle();
    }
    public String validateErrorMesage(){
        return BrowserUtils.getText(errorMesage);
    }
}
