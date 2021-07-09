package com.ui.locators;

import org.openqa.selenium.By;

public enum HomePageLocators implements BaseLocator {

    COMPUTER_PAGE_BUTTON(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")),
    EXPENSIVE_COMPUTER_BUTTON(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[6]/div/div[2]/h2/a"));

    private By path;

    HomePageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}