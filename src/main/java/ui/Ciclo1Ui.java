package ui;
import net.serenitybdd.screenplay.targets.Target;

public class Ciclo1Ui {

    public static final Target FECHA = Target.the("Escoger fecha")
            .locatedBy("//input[@id='txt_visit_date']");


    public static final Target TEXTO = Target.the("Cadena de texto")
            .locatedBy("//textarea[@id='txt_comment']");

    public static final Target SIGUIENTECICLO = Target.the("Boton de siguiente")
            .locatedBy("//button[@id='btn-book-appointment']");

    public static final Target PAGINAPRINCIPAL = Target.the("Boton pagina principal")
            .locatedBy("//a[@class='btn btn-default']");

    public static final Target MENUDESPLEGABLE = Target.the("Menu hamburguesa para cerrar sesion")
            .locatedBy("//a[@id='menu-toggle']");
    public static final Target SALIR = Target.the("Cerrar sesion")
            .locatedBy("//li[5]");




}
