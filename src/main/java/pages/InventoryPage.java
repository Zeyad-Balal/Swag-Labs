package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;
    private By side_menu_button = By.id("react-burger-menu-btn");
    private By logout_button = By.id("logout_sidebar_link");


    public InventoryPage(WebDriver driver)
    {this.driver = driver;}

    public void clicl_side_menu_button()
    {driver.findElement(side_menu_button).click();}

    public void clicl_logout_button()
    {driver.findElement(logout_button).click();}


}
