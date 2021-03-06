package com.ui.elements;

import com.ui.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LabelElement extends BaseElement {
    public LabelElement(WebDriver driver, BaseLocator locator) {
        super(driver, locator);
    }

    public LabelElement(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public int getNumberOfChild() {
        return Integer.parseInt(this.webElement.getAttribute("childElementCount"));
    }

}
