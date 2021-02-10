package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeInicioSesionUserInterface {

  public static final Target TXT_USUARIO = Target.the("Ingresar el nombre de usuario")
      .located(By.id("txtUsername"));

  public static final Target TXT_CLAVE = Target.the("Ingresar la clave")
      .located(By.id("txtPassword"));

  public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesión")
      .locatedBy("//*[@class='add-content']//span[@class='close']");

}
