Feature: Compra de un producto en Demoblaze

  Scenario: Login y agregar un producto al carrito
    Given que el usuario abre la página de Demoblaze
    When inicia sesión con su usuario y contraseña
    And selecciona el producto Samsung Galaxy S6
    And agrega el producto al carrito
    And ingresa al carrito
    Then debería visualizar el producto agregado