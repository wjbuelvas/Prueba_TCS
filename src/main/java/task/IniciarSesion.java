package task;

import static userinterfaces.OrangeInicioSesionUserInterface.BTN_LOGIN;
import static userinterfaces.OrangeInicioSesionUserInterface.TXT_CLAVE;
import static userinterfaces.OrangeInicioSesionUserInterface.TXT_USUARIO;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.Usuarios;

@AllArgsConstructor
public class IniciarSesion implements Task {

  private final String nombreUsuario;

  public static IniciarSesion enOrange(String nombreUsuario) {
    return Tasks.instrumented(IniciarSesion.class, nombreUsuario);
  }


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(TXT_USUARIO),
        Enter.theValue(Usuarios.valueOf(nombreUsuario).getUsuario()).into(TXT_USUARIO),
        Click.on(TXT_CLAVE),
        Enter.theValue(Usuarios.valueOf(nombreUsuario).getClave()).into(TXT_CLAVE),
        Click.on(BTN_LOGIN));
  }
}
