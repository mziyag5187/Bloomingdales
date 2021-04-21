package com.bloomingdales.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualProductPage extends BasePage {

    @FindBy(css="div.col.b-pdp__checkout-button")
    public WebElement addToBagBtn;

    @FindBy(css="div.information-message")
    public WebElement infoMessage;




}
