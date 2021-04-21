package com.bloomingdales.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".icon-bag__logo")
    public WebElement bagLogoIcon;


}
