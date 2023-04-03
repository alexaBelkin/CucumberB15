package com.smartBear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewAllOrdersPage {
    public ViewAllOrdersPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//tr[2]//td")
    List<WebElement> newOrderLineOne;

    public void validateOrder(String empty,String name, String product, String quantity, String date, String street, String city,
                              String state, String zip, String cardType, String cardNumber, String exp,String empty1){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now=LocalDateTime.now();
        String currentTime= dtf.format(now);
        List<String> expected= Arrays.asList(empty,name,product,quantity,date,street,city,state,zip,cardType,cardNumber,exp,empty1);
        for(int i=1;i<newOrderLineOne.size()-1;i++){
            Assert.assertEquals(expected.get(i), BrowserUtils.getText(newOrderLineOne.get(i)));
        }

    }
}
