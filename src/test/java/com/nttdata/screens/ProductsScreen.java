package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


// mapea los elementos una vez ingresados esta ves en la vista de productos de la appkicacion (por cada vista es una clase)
public class ProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProduct;

    public boolean isProductsDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProduct));
        
        return lblProduct.isDisplayed();
    }
}
