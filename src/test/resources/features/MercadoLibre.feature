#language: es
@testfeature
Característica: buscaProducto
  Yo, como usuario
  Quiero, realizar la búsqueda televisores LED de marca LG
  Para ver todos los televisores disponibles

  @test
  Escenario: Buscar TV Led
    Dado que me encuentro en la página Mercado Libre
    Cuando realizo la búsqueda: "television" de Tv Led LG
    Entonces valido que debería aparecer el título de "Tv led lg"
    Y también valido que al menos exista un item