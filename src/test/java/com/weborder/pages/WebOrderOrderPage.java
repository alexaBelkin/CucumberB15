package com.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;

public class WebOrderOrderPage {
    public WebOrderOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//label[@for='GroupOrder']")
    WebElement clickBox;
    @FindBy(css = "#getAddressNextButton")
    WebElement nextButton;
    @FindBy(css = "#InviteNote")
    WebElement inviteNote;
    @FindBy(css = "#InviteList")
    WebElement inviteList;
    @FindBy(css = "#ConfirmAddressID")
    WebElement selectDeleivry;
    @FindBy(css = "#addressPreview")
    WebElement address;
    @FindBy(css = "#createGroupOrder")
    WebElement createOrderButton;
    @FindBy(tagName = "h1")
    WebElement header;
    @FindBy(xpath = "//p[contains(text(),'Your group order is now pending')]")
    WebElement description;



    public void clickBox(){
        this.clickBox.click();
        this.nextButton.click();
    }
    public void sendNoteToInviteeSection(String text){
        inviteNote.sendKeys(text);
    }
    public void sendEmailsToInviteList(String email1,String email2){
        inviteList.sendKeys(email1,",",email2);
    }
    public void selectDeliveryOption(String deliveryOption,String addressAct){
        BrowserUtils.selectBy(selectDeleivry,deliveryOption,"text");
        Assert.assertTrue(BrowserUtils.getText(address).contains(addressAct));

    }
    public void clickCreateOrder(){
        createOrderButton.click();
    }
    public String validateOrderCreated() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(header);
    }
    public boolean validateParagraph(String text){
        return BrowserUtils.getText(description).contains(text);
    }


}
