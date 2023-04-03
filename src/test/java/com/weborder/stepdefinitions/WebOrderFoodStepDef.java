package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderFoodStepDef {
    WebDriver driver= DriverHelper.getDriver();
    WebOrderOrderPage webOrderOrderPage=new WebOrderOrderPage(driver);


    @When("User clicks Group order Box and Next Button")
    public void user_clicks_group_order_box_and_next_button() {
       webOrderOrderPage.clickBox();

    }
    @When("User send the word {string} for note to the Invitees Section")
    public void user_send_the_word_for_note_to_the_invitees_section(String note) {
        webOrderOrderPage.sendNoteToInviteeSection(note);

    }
    @When("User sends email address which are {string} and {string} to the Invite List")
    public void user_sends_email_address_which_are_and_to_the_invite_list(String email1, String email2) {
        webOrderOrderPage.sendEmailsToInviteList(email1,email2);

    }
    @When("User chooses the delivery address {string} and validates the address {string}")
    public void user_chooses_the_delivery_address_and_validates_the_address(String deliveryOption, String deliveryAddress) {
    webOrderOrderPage.selectDeliveryOption(deliveryOption,deliveryAddress);

    }
    @When("User clicks the create Group Order Button")
    public void user_clicks_the_create_group_order_button() {
        webOrderOrderPage.clickCreateOrder();

    }
    @Then("User validates the header of page {string}")
    public void user_validates_the_header_of_page(String expectedHeader) throws InterruptedException {
        Assert.assertEquals(webOrderOrderPage.validateOrderCreated(),expectedHeader);

    }
    @Then("User validates the word {string}")
    public void user_validates_the_word(String text) {
        Assert.assertTrue(webOrderOrderPage.validateParagraph(text));

    }


}
