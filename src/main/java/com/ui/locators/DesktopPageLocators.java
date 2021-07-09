package com.ui.locators;

import org.openqa.selenium.By;

public enum DesktopPageLocators implements BaseLocator {
    DISPLAY_DROPDOWN_FOUR(By.xpath("//*[@id=\"products-pagesize\"]/option[1]")),
    ITEMS_LIST(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]")),
    PRICE_HIGH_TO_LOW_SORT(By.xpath("//*[@id=\"products-orderby\"]/option[5]")),
    FIRST_OF_SELECTED_SORT_ITEM(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]"));

    private By path;

    DesktopPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
