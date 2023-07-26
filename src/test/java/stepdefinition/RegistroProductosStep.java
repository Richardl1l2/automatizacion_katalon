package stepdefinition;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegistroProductosStep {

    @Before
    public void cargarPagina() {
        OnStage.setTheStage(new OnlineCast());
        }

    @Given("cargar pagina principal")
    public void cargar_pagina_principal() {
        theActorCalled("Richard").attemptsTo(Open.url("https://katalon-demo-cura.herokuapp.com/"));

    }
    @When("ingresar usuario y contrasena")
    public void ingresar_usuario_y_contrasena() {
        theActorCalled("Richard").attemptsTo(new PaginaPrincipal());
    }
    @Then("completar datos solicitados y generar medicamento")
    public void completar_datos_solicitados_y_generar_medicamento() {
        theActorCalled("Richard").attemptsTo(new Ciclo1());
    }




}
