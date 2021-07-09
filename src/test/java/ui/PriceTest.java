package ui;

import com.ui.elements.LabelElement;
import com.ui.pageObject.HomePO;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.BaseTest;

public class PriceTest extends BaseTest {
    @Test
    public void verifyBuildComputerTest() {
        LabelElement buildComputerTest = new HomePO(webDriver)
                .clickExpensiveComputerButton()
                .clickFastProcessorCheckbox()
                .clickEightRamCheckbox()
                .clickOfficeSuit()
                .clickImageViewerCheckbox()
                .clickOtherOfficeSuit()
                .clickAddToCard()
                .clickShoppingCart()
                .getActualPriceLabel();
        Assert.assertEquals(buildComputerTest.getText(), "2105.00");
    }

}
