package com.smartBear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Order')]")
    WebElement orderButton;
    @FindBy(xpath = "//a[contains(text(),'View all orders')]")
    WebElement viewAllOrderButton;

    public void clickOrder(){
        orderButton.click();
    }
    public void clickViewAllOrders(){
        viewAllOrderButton.click();
    }
}
