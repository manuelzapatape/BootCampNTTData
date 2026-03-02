package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By tvTitle = By.cssSelector("#root-app > div > div.ui-search-main.ui-search-main--without-header.ui-search-main--only-products.ui-search-main--4x > aside > div.ui-search-breadcrumb > h1");
    public static By itemsCards = By.cssSelector("div.inventory_item");

}
