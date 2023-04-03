package com.smartBear.stepdef;

import com.smartBear.pages.LoginPage;
import com.smartBear.pages.MainPage;
import com.smartBear.pages.OrderPage;
import com.smartBear.pages.ViewAllOrdersPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.List;
import java.util.Map;

public class SmartBearOrderStepDef {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);
    MainPage mainPage=new MainPage(driver);
    OrderPage orderPage=new OrderPage(driver);
    ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage(driver);
    @Given("User provides username and password and cliking login Button and click order button")
    public void user_provides_username_and_password_and_cliking_login_button_and_click_order_button() {
      loginPage.login(ConfigReader.readProperty("username"),ConfigReader.readProperty("password"));

    }
    @When("User provides {string} and {string} for Product Information")
    public void user_provides_and_for_product_information(String value, String quantity) {
        mainPage.clickOrder();
        orderPage.buildProductInfo(value,quantity);

    }
    @When("User provides {string},{string},{string},{string},{string} for Address Information")
    public void user_provides_for_address_information(String name, String street, String city, String state, String zipcode) {
        orderPage.buildAddress(name,street,city,state,zipcode);
    }
    @When("User choosing {string},{string}, {string} and click Process button for Payment Info")
    public void user_choosing_and_click_process_button_for_payment_info(String cardType, String cardNumber, String expiratio) throws InterruptedException {
        orderPage.buildCard(cardType,cardNumber,expiratio);


    }
    @Then("validate message {string}")
    public void validate_message(String expected) throws InterruptedException {
        Assert.assertTrue(orderPage.validateMessage().contains(expected));

    }
    @Then("User goes to View All Order page and validates added product: {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
    public void user_goes_to_view_all_order_page_and_validates_added_product(String name, String product, String quantity, String date, String street, String city, String state, String zip, String cardType, String cardNumber, String exp) {
    mainPage.clickViewAllOrders();
        viewAllOrdersPage.validateOrder("",name,product,quantity,date,street,city,state,zip,cardType,cardNumber,exp,"");

    }
    @When("User provides product and quantity for Product Information")
    public void user_provides_product_and_quantity_for_product_information(DataTable dataTable) {
        Map<String,String> productInfo=dataTable.asMap();
        mainPage.clickOrder();
        orderPage.buildProductInfo(productInfo.get("product"),productInfo.get("quantity"));

    }
    @When("User provides name,street,city,state,zip for Address Information")
    public void user_provides_name_street_city_state_zip_for_address_information(DataTable dataTable) {
        Map<String,String> addressInfo=dataTable.asMap();
        orderPage.buildAddress(addressInfo.get("name"),addressInfo.get("street"),addressInfo.get("city"),addressInfo.get("state"),addressInfo.get("zip"));


    }
    @When("User choosing card,Card Nr,expirationDate and click Process button for Payment Info")
    public void user_choosing_card_card_nr_expiration_date_and_click_process_button_for_payment_info(DataTable dataTable) throws InterruptedException {
        Map<String,String> paymentInfo=dataTable.asMap();
        orderPage.buildCard(paymentInfo.get("card"),paymentInfo.get("Card Nr"),paymentInfo.get("expirationDate"));


    }
    @Then("validate message Message")
    public void validate_message_message(DataTable dataTable) throws InterruptedException {
        List<String> messageInfo=dataTable.asList();
        Assert.assertTrue(orderPage.validateMessage().contains(messageInfo.get(0)));


    }



}
