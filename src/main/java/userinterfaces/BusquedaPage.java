package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPage {

  public static final Target TXT_ARTICULO = Target.the("Seleccion de lista de articulos")
      .locatedBy("//*[@class=\"item-product product-listado\"]//*[contains(.,'{0}')]//button");

  public static final Target BTN_CERRAR_CUPON = Target.the("Boton para cerrar el cupon principal de descuento")
      .locatedBy("//*[@class='gh-popup gh-popup-suscribete open']//span[@class='gh-close-popup close-popup']");

  public static final Target BTN_CERRAR_CONFIRMACION = Target.the("Boton para cerrar confirmacion de compra")
      .locatedBy("//*[@class='add-content']//span[@class='close']");

  public static final Target BTN_IR_CARRO = Target.the("Boton principal para ir al carro de compras")
      .locatedBy("//*[@href='/checkout'][contains(.,'Ir a mi carrito')]");
}
