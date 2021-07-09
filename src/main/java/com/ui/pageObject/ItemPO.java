package com.ui.pageObject;

import com.ui.elements.ButtonElement;
import com.ui.elements.CheckBoxElement;
import com.ui.locators.ItemPageLocator;
import com.ui.tools.WaitsSwitcher;
import org.openqa.selenium.WebDriver;

public class ItemPO extends BasePage {
    private ButtonElement addToCardButton;
    private ButtonElement shoppingCardButton;
    private CheckBoxElement fastProcessorCheckbox;
    private CheckBoxElement eightGbRamCheckbox;
    private CheckBoxElement imageViewerCheckbox;
    private CheckBoxElement officeSuit;
    private CheckBoxElement otherOfficeSuit;
    private WaitsSwitcher waitsSwitcher;

    public ItemPO(WebDriver driver) {
        super(driver);
        waitsSwitcher = new WaitsSwitcher(driver);
    }


    public ItemPO clickAddToCard() {
        if (addToCardButton == null) {
            addToCardButton = new ButtonElement(this.driver, ItemPageLocator.ADD_TO_CART_BUTTON);
        }
        addToCardButton.click();
        waitsSwitcher.sleep(5000);

        return new ItemPO(driver);
    }

    public ShoppingCartPO clickShoppingCart() {
        if (shoppingCardButton == null) {
            shoppingCardButton = new ButtonElement(this.driver, ItemPageLocator.SHOPPING_CART_BUTTON);
        }
        shoppingCardButton.click();
        return new ShoppingCartPO(driver);
    }
    public ItemPO clickFastProcessorCheckbox() {
        if (fastProcessorCheckbox == null) {
            fastProcessorCheckbox = new CheckBoxElement(this.driver, ItemPageLocator.FAST_PROCESSOR_CHECKBOX);
        }
        fastProcessorCheckbox.click();
        return new ItemPO(driver);
    }
    public ItemPO clickEightRamCheckbox() {
        if (eightGbRamCheckbox == null) {
            eightGbRamCheckbox = new CheckBoxElement(this.driver, ItemPageLocator.EIGHT_GB_RAM_CHECKBOX);
        }
        eightGbRamCheckbox.click();
        return new ItemPO(driver);
    }
    public ItemPO clickImageViewerCheckbox() {
        if (imageViewerCheckbox == null) {
            imageViewerCheckbox = new CheckBoxElement(this.driver, ItemPageLocator.IMAGE_VIEWER_CHECKBOX);
        }
        imageViewerCheckbox.click();
        return new ItemPO(driver);
    }
    public ItemPO clickOfficeSuit() {
        if (officeSuit == null) {
            officeSuit = new CheckBoxElement(this.driver, ItemPageLocator.OFFICE_SUIT_CHECKBOX);
        }
        officeSuit.click();
        return new ItemPO(driver);
    }

    public ItemPO clickOtherOfficeSuit() {
        if (otherOfficeSuit == null) {
            otherOfficeSuit = new CheckBoxElement(this.driver, ItemPageLocator.OTHER_OFFICE_SUIT_CHECKBOX);
        }
        otherOfficeSuit.click();
        return new ItemPO(driver);
    }






}
