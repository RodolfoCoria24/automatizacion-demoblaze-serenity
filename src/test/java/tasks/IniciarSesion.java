package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import userinterfaces.DemoblazePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String password;

    public IniciarSesion(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(DemoblazePage.BTN_LOGIN),

                WaitUntil.the(DemoblazePage.TXT_USERNAME, isVisible())
                        .forNoMoreThan(10).seconds(),

                Enter.theValue(usuario)
                        .into(DemoblazePage.TXT_USERNAME),

                Enter.theValue(password)
                        .into(DemoblazePage.TXT_PASSWORD),

                Click.on(DemoblazePage.BTN_INGRESAR),

                WaitUntil.the(DemoblazePage.LBL_USUARIO_LOGUEADO, isVisible())
                        .forNoMoreThan(15).seconds()
        );

    }

    public static IniciarSesion conCredenciales(String usuario, String password) {
        return instrumented(IniciarSesion.class, usuario, password);
    }
}