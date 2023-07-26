package task;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.Ciclo1Ui;
//import ui.LoginUi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Ciclo1 implements Task {

    private final String fecha;
    StringBuilder cadenatexto = new StringBuilder();
    public Ciclo1() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaCalculada = fechaActual.plusDays(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaInvertida = fechaCalculada.format(formatter);
        String fechaTexto = fechaInvertida;
        this.fecha = fechaTexto ;
        cadenatexto.append(" El ibuprofeno es un antiinflamatorio no esteroideo (AINE), utilizado frecuentemente como antipirético, analgésico y antiinflamatorio. Se utiliza para el alivio sintomático de la fiebre, dolor de cabeza (cefalea), dolor dental (odontalgia), dolor muscular o mialgia, molestias de la menstruación (dismenorrea), dolor neurológico de carácter leve o moderado y dolor postquirúrgico. También se usa para tratar cuadros inflamatorios, como los que se presentan en artritis, artritis reumatoide (AR), hinchazón muscular, dolor de garganta y artritis gotosa. Es usado en ocasiones para tratar el acné debido a sus propiedades antiinflamatorias1\u200B y ha sido expendido en Japón en forma tópica para acné de adultos.2\u200B");

    }









    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(fecha).into(Ciclo1Ui.FECHA));
        actor.attemptsTo(Enter.theValue(cadenatexto).into(Ciclo1Ui.TEXTO));
        actor.attemptsTo(Click.on(Ciclo1Ui.SIGUIENTECICLO));
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(Ciclo1Ui.PAGINAPRINCIPAL));
        actor.attemptsTo(Click.on(Ciclo1Ui.MENUDESPLEGABLE));
        actor.attemptsTo(Click.on(Ciclo1Ui.SALIR));



    }


}