package com.ui.pageObject;

import com.ui.elements.LabelElement;
import com.ui.locators.ShoppingCartLocator;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPO extends BasePage {
    private LabelElement firstItemInShoppingCart;
    private LabelElement firstItemInShoppingCartPrice;

    public ShoppingCartPO(WebDriver driver) {
        super(driver);
    }


    public LabelElement getShoppingCartTable() {

        if (firstItemInShoppingCart == null) {
            firstItemInShoppingCart = new LabelElement(this.driver, ShoppingCartLocator.SHOPPING_CART_TABLE);
        }
        return firstItemInShoppingCart;
    }

    public LabelElement getActualPriceLabel() {

        if (firstItemInShoppingCartPrice == null) {
            firstItemInShoppingCartPrice = new LabelElement(this.driver, ShoppingCartLocator.ACTUAL_PRICE_LABEL);
        }
        return firstItemInShoppingCartPrice;
    }
}
