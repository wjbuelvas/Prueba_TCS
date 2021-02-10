package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Usuarios {

  WILSON("admin", "admin123");

  private final String usuario;
  private final String clave;
}
