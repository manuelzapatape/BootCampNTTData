package com.nttdata.stepsdefinitions;

import com.nttdata.steps.BuscarTvSteps;
import com.nttdata.steps.InventorySteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.*;
import static com.nttdata.core.DriverManager.screenShot;


public class BuscarTvStepsDef {

    private WebDriver driver;

    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Dado("que me encuentro en la página Mercado Libre")
    public void que_me_encuentro_en_la_página_Mercado_Libre() {
        driver = getDriver();
        driver.get("https://www.mercadolibre.com.pe/");
        screenShot();
    }
    @Cuando("realizo la búsqueda de: {string}")
    public void realizo_la_búsqueda_de_TV_LED_LG(String television) {
        BuscarTvSteps buscarTvSteps = new BuscarTvSteps(driver);
        buscarTvSteps.ingresoTv(television);
        screenShot();
    }
    @Entonces ("visualizo Tvs LG")
    public void visualizo_Tvs_LG() {
        screenShot();
    }

}
