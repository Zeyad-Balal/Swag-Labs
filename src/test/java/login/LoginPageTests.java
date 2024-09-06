package login;

import base.BaseTests;
import org.testng.annotations.*;
import pages.InventoryPage;

import static org.testng.Assert.*;

public class LoginPageTests extends BaseTests{

    //Login Scenario with right Credentials.
    @Test
    public void standardUserTest()
    {

        InventoryPage inventory = login.clickLogin();
        //Assert that login done and the driver redirected to next page (invenotry).
        assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","test failed");


    }


}
