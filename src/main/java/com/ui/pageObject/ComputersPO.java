package com.ui.pageObject;

import com.ui.elements.ButtonElement;
import com.ui.locators.ComputerPageLocators;
import org.openqa.selenium.WebDriver;

public class ComputersPO extends BasePage {

    private ButtonElement desktopsButton;

    public ComputersPO(WebDriver driver) {
        super(driver);
    }

    public DesktopsPO clickDesktopButton() {
        if (desktopsButton == null) {
            desktopsButton = new ButtonElement(this.driver, ComputerPageLocators.DESKTOP_BUTTON);
        }
        desktopsButton.click();

        return new DesktopsPO(driver);
    }
}
