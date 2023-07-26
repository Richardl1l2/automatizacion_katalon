package task;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
//import ui.LoginUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class PaginaPrincipal implements Task {


    private final String usuario;
    private final String contrasena;

    public PaginaPrincipal() {
        this.usuario = "John Doe";
        this.contrasena = "ThisIsNotAPassword";
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ui.PaginaPrincipal.SIGUIENTEPRINCIPAL));
        actor.attemptsTo(Enter.theValue(usuario).into(ui.PaginaPrincipal.USUARIO));
        actor.attemptsTo(Enter.theValue(contrasena).into(ui.PaginaPrincipal.CONTRASENA));
        actor.attemptsTo(Click.on(ui.PaginaPrincipal.SIGUIENTE));
    }

}
