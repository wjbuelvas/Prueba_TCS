package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangePaginaInicialUserInterface {

  public static final Target LBL_ORANGE = Target.the("Label Ornage")
      .located(By.id("txtUsername"));

  public static final Target LBL_MENSAJE_ERROR = Target.the("Label Mensaje de error Ornage")
      .located(By.id("//*[@id=\"toast-container\"]/div/div"));


}
