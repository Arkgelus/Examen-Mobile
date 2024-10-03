package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class LoginSteps {

    LoginScreen loginScreen;
    ProductsScreen productsScreen;

    public void login(String username, String password){
        loginScreen.enterUser(username);
        loginScreen.enterPassword(password);
        loginScreen.clickLogin();
    }

    public void loginSuccess(){

        Assert.assertTrue("Login no satisfactorio", productsScreen.isProductsDisplayed());
    }

    public void validateErrorMessage(String message){
        Assert.assertEquals("Mensaje de error es incorrecto", loginScreen.getErrorMessage(), message);
    }
}
