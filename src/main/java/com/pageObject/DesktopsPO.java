package com.pageObject;

import com.elements.ButtonElement;
import com.elements.LabelElement;
import com.locators.DesktopPageLocators;
import org.openqa.selenium.WebDriver;

public class DesktopsPO extends BasePage {
    private ButtonElement selectDisplayDropdownFour;
    private ButtonElement highToLowSort;
    private ButtonElement firstItem;
    private LabelElement itemBoxLabel;

    public DesktopsPO(WebDriver driver) {
        super(driver);
    }



    public DesktopsPO selectDisplayDropdownFour() {
        if (selectDisplayDropdownFour == null) {
            selectDisplayDropdownFour = new ButtonElement(this.driver, DesktopPageLocators.DISPLAY_DROPDOWN_FOUR);
        }
        selectDisplayDropdownFour.click();

        return new DesktopsPO(driver);
    }

    public DesktopsPO selectHighToLowSort() {
        if (highToLowSort == null) {
            highToLowSort = new ButtonElement(this.driver, DesktopPageLocators.PRICE_HIGH_TO_LOW_SORT);
        }
        highToLowSort.click();

        return new DesktopsPO(driver);
    }

    public ItemPO clickOnTheFirstItemOfSelectedSort() {
        if (firstItem == null) {
            firstItem = new ButtonElement(this.driver, DesktopPageLocators.FIRST_OF_SELECTED_SORT_ITEM);
        }
        firstItem.click();

        return new ItemPO(driver);
    }

    public LabelElement getItemsBoxLabel() {

        if (itemBoxLabel == null) {
            itemBoxLabel = new LabelElement(this.driver, DesktopPageLocators.ITEMS_LIST);
        }
        return itemBoxLabel;
    }

}
