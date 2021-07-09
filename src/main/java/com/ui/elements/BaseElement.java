package com.ui.elements;

import com.ui.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseElement {
    protected WebDriver driver;
    public WebElement webElement;
    protected By path;
    protected Actions actions;

    public BaseElement(WebDriver driver, BaseLocator locator) {
        this.driver = driver;
        this.path = locator.getPath();
        webElement = driver.findElement(path);
    }

    public BaseElement(WebElement webElement, BaseLocator locator) {
        this.path = locator.getPath();
        this.webElement = webElement.findElement(path);
    }

    public BaseElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public String getText() {
        return webElement.getText();
    }

    public void click() {
        this.webElement.click();
    }

    public void moveToElement(){
        actions.moveToElement(webElement);
    }

}