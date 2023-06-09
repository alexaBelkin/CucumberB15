package com.smartBear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@type='text']")
    WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement clickButton;

    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        clickButton.click();
    }




}
