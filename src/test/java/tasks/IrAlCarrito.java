package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import userinterfaces.DemoblazePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAlCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(DemoblazePage.BTN_CART, isVisible())
                        .forNoMoreThan(10).seconds(),

                Click.on(DemoblazePage.BTN_CART)

        );

    }

    public static IrAlCarrito visualizar() {
        return instrumented(IrAlCarrito.class);
    }
}