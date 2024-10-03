package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginExaStepsDefs {
    @Steps
    LoginSteps loginSteps;

    @Given("estoy en la aplicacion SauceLabs")
    public void estoyEnLaAplicacionSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
    }

    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String arg0, String arg1) {
    }

    @Then("valido que el carrito de compra actualice correctamente {string}")
    public void validoQueElCarritoDeCompraActualiceCorrectamente(String arg0) {
    }







    @Given("Estoy en el perfil de la app")
    public void estoyEnElPerfilDeLaApp() {
    }

    @When("ingreso las credenciales username {string} y el password {string}")
    public void ingresoLasCredencialesUsernameYElPassword(String username, String password) {
        loginSteps.login(username, password);
    }

    @Then("puedo iniciar exitosamente")
    public void puedoIniciarExitosamente() {
        loginSteps.loginSuccess();
    }
}
