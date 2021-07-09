package ui;

import com.ui.elements.LabelElement;
import com.ui.pageObject.HomePO;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.BaseTest;

public class DesktopTest extends BaseTest {
    @Test
    public void verifyDropDownMenuFourOption() {
    LabelElement dropdown = new HomePO(webDriver)
            .clickComputerButton()
            .clickDesktopButton()
            .selectDisplayDropdownFour()
            .getItemsBoxLabel();
   Assert.assertEquals(dropdown.getNumberOfChild(),4);
    }

    @Test
    public void verifyAddToShoppingCard() {
        LabelElement shoppingCart = new HomePO(webDriver)
                .clickComputerButton()
                .clickDesktopButton()
                .selectHighToLowSort()
                .clickOnTheFirstItemOfSelectedSort()
                .clickAddToCard()
                .clickShoppingCart()
                .getShoppingCartTable();
        Assert.assertEquals(shoppingCart.getNumberOfChild(),1);
    }

}
