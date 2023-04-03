package com.smartBear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {
    public OrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@onchange='productsChanged()']")
    WebElement selectProduct;
    @FindBy(xpath = "//input[@onchange='productsChanged()']")
    WebElement quantity;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    WebElement customerName;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    WebElement street;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    WebElement city;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    WebElement zipcode;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    WebElement state;
    @FindBy(xpath = "//input[@value='Visa']")
    WebElement visaBox;
    @FindBy(xpath = "//input[@value='MasterCard']")
    WebElement masterCardBox;
    @FindBy(xpath = "//input[@value='American Express']")
    WebElement american;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement cardNumber;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expDate;
    @FindBy(xpath = "//a[contains(text(),'Process')]")
    WebElement processButton;
    @FindBy(tagName = "strong")
    WebElement message;



    public void buildProductInfo(String value,String number){
        BrowserUtils.selectBy(selectProduct,value,"text");
        quantity.clear();
        quantity.sendKeys(number);
    }
    public void buildAddress(String name,String street,String city,String state,String zipcode){
        this.customerName.sendKeys(name);
        this.street.sendKeys(street);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zipcode.sendKeys(zipcode);

    }
    public void buildCard(String cardType,String cardNumber,String expiration) throws InterruptedException {
        switch (cardType.toLowerCase()){
            case "visa":
                visaBox.click();
                break;
            case "mastercard":
                masterCardBox.click();
                break;
            case"american express":
                american.click();
                break;
            default:
                System.out.println("ERROR");
        }
        this.cardNumber.sendKeys(cardNumber);
        this.expDate.sendKeys(expiration);
        Thread.sleep(2000);
        this.processButton.click();

    }
    public String validateMessage() throws InterruptedException {

        return BrowserUtils.getText(message);
    }

}
