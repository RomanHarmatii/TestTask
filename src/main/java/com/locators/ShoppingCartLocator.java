package com.locators;

import org.openqa.selenium.By;

public enum ShoppingCartLocator implements BaseLocator {
    SHOPPING_CART_TABLE(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div > div > div.page-body > div > form > table > tbody")),
    ACTUAL_PRICE_LABEL(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[6]/span[2]"));

    private By path;

    ShoppingCartLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
