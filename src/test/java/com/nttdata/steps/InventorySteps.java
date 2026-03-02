package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.MercadoLibrePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //contrsuctor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    public void manejarPopUp() {
        try {
            // Espera corta de 3 a 5 segundos para ver si aparece
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement boton = wait.until(ExpectedConditions.elementToBeClickable(InventoryPage.popUp));
            boton.click();

        } catch (Exception e) {
            // Si no aparece, el catch evita que la prueba falle y continúa
            System.out.println("El popup no apareció, continuando...");
        }
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getTitle(){
        return this.driver.findElement(InventoryPage.tvTitle).getText();
    }

    /**
     * Retorna la cantidad de items
     * @return la cantidad de items
     */
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsCards);
        return items.size();
    }



}
