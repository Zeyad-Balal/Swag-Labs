package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.InventoryPage;
import pages.LoginPage;

import org.testng.annotations.*;

public class BaseTests {
    protected WebDriver driver;
    protected LoginPage login;

   @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        login = new LoginPage(driver);
        credentials();



    }

    //logins user and pass..
    public void credentials()
    {
        login.setUsername("standard_user");
        login.setPassword();

    }


}
