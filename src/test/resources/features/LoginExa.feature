Feature: Funcionalidad carrito de compra
  Scenario Outline: Validar las compras del carro y validad la actualizacion
    Given estoy en la aplicacion SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego "<unidades>" del siguiente producto "<producto>"
    Then valido que el carrito de compra actualice correctamente "<producto>"
    Examples:
    |producto|unidades|
    |Sauce Labs Backpack|1|
    |Sauce Labs Bolt - T-Shirt|1|
    |Sauce Labs Bike Light|2|


    Scenario: Login de a la app exitoso
      Given Estoy en el perfil de la app
      When ingreso las credenciales username "bod@example.com" y el password "10203040"
      Then puedo iniciar exitosamente
