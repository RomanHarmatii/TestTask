package com.ui.pageObject;

import com.ui.elements.ButtonElement;
import com.ui.locators.HomePageLocators;
import org.openqa.selenium.WebDriver;

public class HomePO extends BasePage {
    private ButtonElement computerButton;
    private ButtonElement expensiveComputerButton;

    public HomePO(WebDriver driver) {
        super(driver);
    }

    public ComputersPO clickComputerButton() {
        if (computerButton == null) {
            computerButton = new ButtonElement(this.driver, HomePageLocators.COMPUTER_PAGE_BUTTON);
        }
        computerButton.click();

        return new ComputersPO(driver);
    }

    public ItemPO clickExpensiveComputerButton() {
        if (expensiveComputerButton == null) {
            expensiveComputerButton = new ButtonElement(this.driver, HomePageLocators.EXPENSIVE_COMPUTER_BUTTON);
        }
        expensiveComputerButton.click();

        return new ItemPO(driver);
    }

}
