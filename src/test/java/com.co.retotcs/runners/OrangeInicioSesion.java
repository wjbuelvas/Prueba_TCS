package com.co.retotcs.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/inicio_sesion.feature",
    glue = {"src/test/java/stepdefinitions"}
)

public class OrangeInicioSesion {}
