package login;

import base.BaseTests;
import org.testng.annotations.*;

public class LoginPageTests extends BaseTests{

    @Test
    public void standardUserTest()
    {
        login.setUsername("standard_user");
        login.setPassword();
        login.clickLogin();
    }


}
