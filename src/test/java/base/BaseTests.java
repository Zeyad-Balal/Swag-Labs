package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import org.testng.annotations.*;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }
}
