package com.bloomingdales.step_definitions;

import com.bloomingdales.pages.BasePage;
import com.bloomingdales.pages.BasketPage;
import com.bloomingdales.pages.HomePage;
import com.bloomingdales.pages.IndividualProductPage;
import com.bloomingdales.utilities.BrowserUtils;
import com.bloomingdales.utilities.ConfigurationReader;
import com.bloomingdales.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Locale;

public class BasketStepDefs extends BasePage {

    BasketPage basketPage = new BasketPage();

    @When("the user is on the Home Page as a guest user")
    public void the_user_is_on_the_Home_Page_as_a_guest_user() {
        Driver.get().get(ConfigurationReader.get("homePageUrl"));
    }

    @And("the user clicks on the Bag Logo icon on the top left corner")
    public void the_user_clicks_on_the_Bag_Logo_icon_on_the_top_left_corner() {
        HomePage homePage = new HomePage();
        homePage.bagLogoIcon.click();
    }

    @Then("the user should able to navigate his or her Bag page")
    public void the_user_should_able_to_navigate_his_or_her_Bag_page() {
        Assert.assertEquals(ConfigurationReader.get("basketPageUrl"),Driver.get().getCurrentUrl());
    }

    @When("the user is on the Basket Page as a guest user")
    public void the_user_is_on_the_Basket_Page_as_a_guest_user() {
        Driver.get().get(ConfigurationReader.get("basketPageUrl"));
    }

    @And("the user should see the Basket is empty")
    public void the_user_should_see_the_Basket_is_empty() {
        Assert.assertEquals("YOUR SHOPPING CART IS EMPTY",basketPage.emptyCardText.getText().toUpperCase());
    }

    @When("the user clicks on any product on the Basket page")
    public void the_user_clicks_on_any_product_on_the_Basket_page() {
        basketPage.allProductImages.get(0).click();
    }

    @When("the user adds that product to Basket")
    public void the_user_adds_that_product_to_Basket() {
        new IndividualProductPage().addToBagBtn.click();
    }

    @Then("the user should be able see the message {string}")
    public void the_user_should_be_able_see_the_message(String expectedMessage) {
        String actualMessage = new IndividualProductPage().infoMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("the user removes one product from the Basket")
    public void the_user_removes_one_product_from_the_Basket() {
        Driver.get().get(ConfigurationReader.get("basketPageUrl"));
        basketPage.remove.click();
        basketPage.removeBtn.click();
    }
    @Then("the user should be able to remove the product successfully")
    public void the_user_should_be_able_to_remove_the_product_successfully() {
        BrowserUtils.waitFor(2);
        Assert.assertEquals("YOUR SHOPPING CART IS EMPTY",basketPage.emptyCardText.getText().toUpperCase());
    }

    @Then("the user should be able to see the {string} content in the Basket page")
    public void the_user_should_be_able_to_see_the_content_in_the_Basket_page(String expectedContent) {
        String actualContent = basketPage.freeShippingContent.getText();
        Assert.assertTrue(actualContent.contains(expectedContent.toUpperCase()));
    }



}
