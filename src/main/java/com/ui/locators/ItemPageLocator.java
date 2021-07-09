package com.ui.locators;

import org.openqa.selenium.By;

public enum ItemPageLocator implements BaseLocator {
    ADD_TO_CART_BUTTON(By.xpath("//*[@value=\"Add to cart\"]")),
    SHOPPING_CART_BUTTON(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")),
    FAST_PROCESSOR_CHECKBOX(By.xpath("//*[@id=\"product_attribute_74_5_26_82\"]")),
    EIGHT_GB_RAM_CHECKBOX(By.xpath("//*[@id=\"product_attribute_74_6_27_85\"]")),
    IMAGE_VIEWER_CHECKBOX(By.xpath("//*[@id=\"product_attribute_74_8_29_88\"]")),
    OFFICE_SUIT_CHECKBOX(By.xpath("//*[@id=\"product_attribute_74_8_29_89\"]")),
    OTHER_OFFICE_SUIT_CHECKBOX(By.xpath("//*[@id=\"product_attribute_74_8_29_90\"]"));

    private By path;

    ItemPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
