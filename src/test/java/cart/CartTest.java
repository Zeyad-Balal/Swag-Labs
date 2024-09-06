package cart;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;

import static org.testng.Assert.assertEquals;

public class CartTest extends BaseTests {

    @Test
    public void test_items_count()
    {

        InventoryPage inventory = login.clickLogin();
        inventory.click_add_to_cart();

        CartPage cartPage = inventory.open_cart();

        //Assert the number of items user add to cart equally same in the cart already.
        assertEquals(cartPage.get_items_count_in_cart(),2,"");

        cartPage.click_cont_shopping();

    }


}
