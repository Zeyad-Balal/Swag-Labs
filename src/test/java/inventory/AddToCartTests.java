package inventory;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import static org.testng.Assert.*;


public class AddToCartTests extends BaseTests {

    @Test
    public void add_to_cart_test()
    {

        InventoryPage inventory = login.clickLogin();

        //add tshirt and jacket to cart.
        inventory.click_add_to_cart();

        //open cart to check items.
        CartPage cart = inventory.open_cart();

        //Assert that we successfully moved to nex page.
        assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html","fail");

    }

    @Test
    public void test_continue_shopping()
    {

    }
}
