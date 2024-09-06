package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import login.LoginPage;

import org.testng.annotations.*;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage login;

   @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        login = new LoginPage(driver);

    }
}
