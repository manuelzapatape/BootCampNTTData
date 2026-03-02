package com.nttdata.steps;

import com.nttdata.core.DriverManager;
import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import com.nttdata.page.MercadoLibrePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.*;


public class BuscarTvSteps {

    private WebDriver driver;

    //constructor
    public BuscarTvSteps(WebDriver driver){
        this.driver = driver;
    }

    public void tvLed(String television){
        WebElement tvInputElement = driver.findElement(MercadoLibrePage.buscarInput);
        tvInputElement.sendKeys(television);
        //Espera implicita
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        //Espera explicita
        wait.until(ExpectedConditions.visibilityOfElementLocated(MercadoLibrePage.buscarInput));
    }

    /**
     * Hacer click en el botón buscar
     */
    public void buscar(){
        this.driver.findElement(MercadoLibrePage.buscarButton).click();
    }


    public void ingresoUsuarioYClave(String user, String password) {
        tvLed(television);
        esperaImplicita();
        buscar();
    }
}


}
