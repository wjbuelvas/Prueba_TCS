package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import task.Abrir;

public class ConfiguracionInicial {

  @Before
  public void configuracionInicial() {
    setTheStage(new OnlineCast());
    theActorCalled("Wilson");
  }

  @Dado("que el actor desea abrir la página de {word}")
  public void abrirURL(String nombrePagina){
    theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina));

  }
}