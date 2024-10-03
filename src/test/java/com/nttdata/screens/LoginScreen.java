package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
// esta clase es la segunda en crearce para logeo
public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to login with given credentials\"]")
    private WebElement btnLogin;

    // ya se hace para user bloqueado
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordErrorTV\"]")
    private WebElement lblErrorMessage;

    public void enterUser(String username){

        txtUsername.sendKeys(username);
    }

    public void enterPassword(String password){

        txtPassword.sendKeys(password);
    }

    public void clickLogin(){
        
        btnLogin.click();
    }

    public String getErrorMessage(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(lblErrorMessage));
        return lblErrorMessage.getText();
    }


}
