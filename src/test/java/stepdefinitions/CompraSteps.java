package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import questions.ProductoEnCarrito;
import tasks.AbrirPagina;
import tasks.AgregarAlCarrito;
import tasks.IniciarSesion;
import tasks.IrAlCarrito;
import tasks.SeleccionarProducto;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class CompraSteps {

    private Actor usuario;

    @Before
    public void configurarEscenario() {
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("Rodolfo");
    }

    @Given("que el usuario abre la página de Demoblaze")
    public void abrirPagina() {

        usuario.attemptsTo(
                AbrirPagina.enDemoblaze()
        );

    }

    @When("inicia sesión con su usuario y contraseña")
    public void iniciarSesion() {

        usuario.attemptsTo(
                IniciarSesion.conCredenciales("rodolfocoria24", "zxcvbnm123")
        );

    }

    @And("selecciona el producto Samsung Galaxy S6")
    public void seleccionarProducto() {

        usuario.attemptsTo(
                SeleccionarProducto.samsungGalaxyS6()
        );

    }

    @And("agrega el producto al carrito")
    public void agregarProducto() {

        usuario.attemptsTo(
                AgregarAlCarrito.alCarrito()
        );

    }

    @And("ingresa al carrito")
    public void ingresarCarrito() {

        usuario.attemptsTo(
                IrAlCarrito.visualizar()
        );

    }

    @Then("debería visualizar el producto agregado")
    public void validarProducto() {

        usuario.should(
                seeThat("El producto se visualiza en el carrito",
                        ProductoEnCarrito.esVisible(), is(true))
        );

    }

}