package com.elements;

import com.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxElement extends BaseElement{
    public CheckBoxElement(WebDriver driver, BaseLocator locator) {
        super(driver, locator);
    }

    public CheckBoxElement(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public CheckBoxElement(WebElement webElement) {
        super(webElement);
    }


}
