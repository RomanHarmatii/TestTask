package com.ui.elements;

import com.ui.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public class ButtonElement extends BaseElement {

    private Logger log = Logger.getLogger(ButtonElement.class.getName());

    public ButtonElement(WebDriver driver, BaseLocator locator) {
        super(driver, locator);
    }

    public ButtonElement(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public ButtonElement(WebElement webElement) {
        super(webElement);
    }


}
