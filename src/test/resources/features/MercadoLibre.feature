#language: es
@testfeature
Característica: buscaProducto
  Yo, como usuario
  Quiero, realizar la búsqueda televisores LED de marca LG
  Para ver todos los televisores disponibles

  @test
  Escenario: Buscar TV Led
    Dado que me encuentro en la página "https://www.mercadolibre.com.pe/"
    Cuando realizo la búsqueda de tv led lg: "standard_user" y contraseña: "secret_sauce"
    Entonces valido que debería aparecer el título de "Products"
    Y también valido que al menos exista un item