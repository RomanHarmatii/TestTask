package com.locators;

import org.openqa.selenium.By;

public enum ComputerPageLocators implements BaseLocator {
    DESKTOP_BUTTON(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a/img"));

    private By path;

    ComputerPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
