package login;

import base.BaseTests;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class LoginPageTests extends BaseTests{

    //Login Scenario with right Credentials.
    @Test
    public void standardUserTest()
    {
        login.setUsername("standard_user");
        login.setPassword();
        login.clickLogin();

        //Assert that login done and the driver redirected to next page (invenotry).
        assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","test failed");


    }


}
