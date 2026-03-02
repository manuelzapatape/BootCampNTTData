#language: es
@testfeature
Característica: buscaProducto
  Yo, como usuario
  Quiero, realizar la búsqueda televisores LED de marca LG
  Para ver todos los televisores disponibles

  @test
  Escenario: Buscar TV Led
    Dado que me encuentro en la página Mercado Libre
    Cuando realizo la búsqueda de: "Televisores Led 40 pulgadas"
    Entonces visualizo Tvs LG
