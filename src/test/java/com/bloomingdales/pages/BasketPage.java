package com.bloomingdales.pages;

import jdk.jfr.SettingDefinition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasketPage extends BasePage{

    @FindBy(css="h2.b-cart-empty__title.m-t__main-heading.text-uppercase")
    public WebElement emptyCardText;

    @FindBy(css="img.dy-recommendation-product__image")
    public List<WebElement> allProductImages;


    @FindBy(xpath = "(//button/span[.='Remove' and @aria-hidden='true'])[1]")
    public WebElement remove;

    @FindBy(xpath = "//button[contains(@class,'cart-delete-confirmation-btn')]")
    public WebElement removeBtn;

    @FindBy(xpath = "//span[contains(.,'Free Shipping')]")
    public WebElement freeShippingContent;




}
