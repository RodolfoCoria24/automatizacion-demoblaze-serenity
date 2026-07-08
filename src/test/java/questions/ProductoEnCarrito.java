package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import userinterfaces.DemoblazePage;

public class ProductoEnCarrito implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return DemoblazePage.LBL_PRODUCTO_CARRITO
                .resolveFor(actor)
                .isVisible();

    }

    public static Question<Boolean> esVisible() {
        return new ProductoEnCarrito();
    }

}