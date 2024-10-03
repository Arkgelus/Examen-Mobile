package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BackPackSMochilaScreen extends Object{
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProduct;

    public boolean isProductsDisplayed(){


        return lblProduct.isDisplayed();
    }
}
