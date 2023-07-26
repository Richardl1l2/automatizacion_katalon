Feature: Ingresar en la pagina  katalon-demo-cura.herokuapp.com y realizar registro de datos medicos

  @eegistro
  Scenario: Iniciar sesion y realizar ingreso de datos
    Given cargar pagina principal
    When  ingresar usuario y contrasena
    Then  completar datos solicitados y generar medicamento


