package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazePage {

    // Login
    public static final Target BTN_LOGIN = Target.the("Botón Log in del menú principal")
            .located(By.xpath("//a[@id='login2']"));

    public static final Target TXT_USERNAME = Target.the("Campo usuario")
            .located(By.xpath("//input[@id='loginusername']"));

    public static final Target TXT_PASSWORD = Target.the("Campo contraseña")
            .located(By.xpath("//input[@id='loginpassword']"));

    public static final Target BTN_INGRESAR = Target.the("Botón Log in del modal")
            .located(By.xpath("//button[@onclick='logIn()']"));

    public static final Target LBL_USUARIO_LOGUEADO = Target.the("Mensaje de usuario logueado")
            .located(By.xpath("//a[@id='nameofuser']"));

    // Producto
    public static final Target LNK_SAMSUNG = Target.the("Producto Samsung Galaxy S6")
            .located(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));

    public static final Target BTN_ADD_TO_CART = Target.the("Botón Add to cart")
            .located(By.xpath("//a[normalize-space()='Add to cart']"));

    // Carrito
    public static final Target BTN_CART = Target.the("Botón Cart")
            .located(By.xpath("//a[@id='cartur']"));

    public static final Target LBL_PRODUCTO_CARRITO = Target.the("Producto agregado en el carrito")
            .located(By.xpath("//td[normalize-space()='Samsung galaxy s6']"));
}