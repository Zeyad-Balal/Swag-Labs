package inventory;

import base.BaseTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.InventoryPage;

public class LogoutTests extends BaseTests {

    //normal logout test
    @Test
    public void logout_test()
    {
        login.setUsername("standard_user");
        login.setPassword();
        InventoryPage inventoryPage =  login.clickLogin(); //give the driver to InventoryPage class to access its functionalities.
        //inventoryPage.add_to_cart_clicker(); // JUST TEST
        inventoryPage.click_side_menu_button(); // open side menu bar
        inventoryPage.click_logout_button(); // logout clicker.
        //After LOGOUT...
        //Assert that the logout done and the driver returned to prev. login page.
        assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/", "test fail");
    }

    //After logout we need to chech if password field is empty (for more security).
    @AfterMethod
    public void check_password_field()
    {
        assertEquals(login.check_password_field(),"","not empty");
    }

}
