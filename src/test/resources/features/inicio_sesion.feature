#language: es
#wbuelvas@qvision.com.co

Característica: Yo como usuario de Orange HRM
  deseo realizar la gestión de usuarios
  para loguearme, agregar y buscar nuevos usuarios

  Antecedentes:
    Dado que el actor desea abrir la página de Orange

  Escenario: Iniciar sesión en Orange HRM
    Cuando Wilson incia sesion en la pagina de Orange HRM
    Entonces puede visualizar el modulo de bienvenida

  Escenario: Iniciar sesión en Orange HRM con usuarios incorrectos
    Cuando Carlos intenta inciar sesion con datos incorrectos en la pagina de Orange HRM
    Entonces se presenta el siguiente mensaje "Invalid Credentials"
