package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepsDefs {

    @Steps
    LoginSteps loginSteps;


    @Given("que estoy en la aplicación de Swag Labs")
    public void que_estoy_en_la_aplicación_de_swag_labs() {

    }
    @When("ingreso mis credenciales username {string} y password {string}")
    public void ingreso_mis_credenciales_username_y_password(String username, String password) {
        loginSteps.login(username, password);
    }
    @Then("el inicio de sesión es exitoso")
    public void el_inicio_de_sesión_es_exitoso() {

        loginSteps.loginSuccess();
    }

    @Then("se muestra el mensaje de error: {string}")
    public void seMuestraElMensajeDeError(String message) {

        loginSteps.validateErrorMessage(message);
    }
}
