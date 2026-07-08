package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import userinterfaces.DemoblazePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DemoblazePage.LNK_SAMSUNG, isVisible())
                        .forNoMoreThan(15).seconds(),

                Click.on(DemoblazePage.LNK_SAMSUNG)
        );

    }

    public static SeleccionarProducto samsungGalaxyS6() {
        return instrumented(SeleccionarProducto.class);
    }
}