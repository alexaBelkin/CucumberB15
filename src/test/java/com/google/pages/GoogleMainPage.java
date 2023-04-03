package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class GoogleMainPage {
    public GoogleMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title='Search']")
    WebElement searchBar;
    @FindBy(xpath = "//a//h3")
    List<WebElement> allLinks;
    @FindBy(css = "#result-stats")
    WebElement searchResult;
    @FindBy(xpath = "//div[@id='result-stats']//nobr")
    WebElement searchTime;


    public void validateHappySearch(String text){
        searchBar.sendKeys(text, Keys.ENTER);

    }
    public boolean validateNumberOfLinks(int number){
        return (allLinks.size()>number);
    }

    public boolean validateSearchResult(int number){
        String[] str= BrowserUtils.getText(searchResult).split(" ");
       // Long result=Long.parseLong(str[1].replace(",",""));
         return Integer.parseInt(str[1].replace(",",""))<=number;
    }
    public boolean validateTimeSearch(){
        String[] result=BrowserUtils.getText(searchTime).split(" ");
        return (Double.parseDouble(result[0].substring(1))<1.0);
    }
}
