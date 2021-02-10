package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ComprobarInicioSesion;
import task.IniciarSesion;

public class OrangeInicioSesion {

  @Cuando("{word} incia/iniciar sesion en la pagina de Orange HRM")
  public void iniciarSesionOrange(String nombreUsuario) {
    OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.enOrange(nombreUsuario));
  }

  @Cuando("{word} intenta inciar sesion con datos incorrectos en la pagina de Orange HRM")
  public void iniciarSesionIncorrectoOrange(String nombreUsuario) {
    OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.enOrange(nombreUsuario));
  }

  @Entonces("se presenta el siguiente mensaje {String}")
  public void validarMensajeInicioSesionIncorrecto(String mensajeError) {
    OnStage.theActorInTheSpotlight().should(seeThat(ComprobarInicioSesion.enOrange(),
        Matchers.containsString(mensajeError)));
  }

  @Entonces("puede visualizar el modulo de bienvenida")
  public void validarInicioSesion() {
    OnStage.theActorInTheSpotlight().should(seeThat(ComprobarInicioSesion.enOrange(),
        Matchers.containsString("true")));
  }

}
