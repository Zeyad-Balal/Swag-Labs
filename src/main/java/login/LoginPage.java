package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By user = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {driver.findElement(user).sendKeys(username);} //write username
    public void setPassword() {driver.findElement(password).sendKeys("secret_sauce");} //write DEFAULT password
    public void clickLogin() {driver.findElement(loginButton).click();} //click login

}
