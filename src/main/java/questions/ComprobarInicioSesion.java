package questions;

import static userinterfaces.OrangePaginaInicialUserInterface.LBL_ORANGE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ComprobarInicioSesion implements Question<String> {


  public static ComprobarInicioSesion enOrange(){
    return new ComprobarInicioSesion();
  }

  @Override
  public String answeredBy(Actor actor) {
    return Text.of(LBL_ORANGE)
        .viewedBy(actor).asString();

  }

}
