package ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {

    public static final Target SIGUIENTEPRINCIPAL = Target.the("Botón para acceder en la pagina").locatedBy("//a[@id='btn-make-appointment']");

    public static final Target USUARIO = Target.the("Campo para ingresar datos usuario").locatedBy("//input[@id='txt-username']");
    public static final Target CONTRASENA = Target.the("Campo para ingresar datos contraseña").locatedBy("//input[@id='txt-password']");
    public static final Target SIGUIENTE = Target.the("Botón para acceder en la pagina").locatedBy("//button");

}
