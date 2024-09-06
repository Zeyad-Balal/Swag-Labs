package inventory;

import base.BaseTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.InventoryPage;
import pages.LoginPage;

public class LogoutTests extends BaseTests {

    //normal logout test
    @Test
    public void logout_test()
    {
        login.setUsername("standard_user");
        login.setPassword();
        InventoryPage inventoryPage =  login.clickLogin(); //give the driver to InventoryPage class to access its functionalities.
        inventoryPage.clicl_side_menu_button(); // open side menu bar
        inventoryPage.clicl_logout_button(); // logout clicker.
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
