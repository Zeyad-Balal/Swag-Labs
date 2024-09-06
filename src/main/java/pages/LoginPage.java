package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By user = By.id("user-name");
    protected By password = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {driver.findElement(user).sendKeys(username);} //write username
    public void setPassword() {driver.findElement(password).sendKeys("secret_sauce");} //write DEFAULT password
    public InventoryPage clickLogin() {
        driver.findElement(loginButton).click();
        return new InventoryPage(driver);
    } //click login then redirect to Inventory Page -> called first in inventory test to return the page.

    //After logout we need to chech if password field is empty (for more security).
    public String check_password_field()
    {
        return driver.findElement(password).getAttribute("value");
    }

}
