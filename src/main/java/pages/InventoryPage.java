package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;
    private By side_menu_button = By.id("react-burger-menu-btn");
    private By logout_button = By.id("logout_sidebar_link");
    private By cart = By.className("shopping_cart_link"); // open cart from icon



    //static TEST DATA
    private By sauce_labs_bolt_tshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By sauce_labs_fleece_jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By sauce_labs_back = By.id("add-to-cart-sauce-labs-backpack");



    public InventoryPage(WebDriver driver)
    {this.driver = driver;}

    public void click_side_menu_button()
    {driver.findElement(side_menu_button).click();}

    public void click_logout_button()
    {driver.findElement(logout_button).click();}



    public void click_add_to_cart()
    {

        driver.findElement(sauce_labs_bolt_tshirt).click();
        driver.findElement(sauce_labs_fleece_jacket).click();

    }

    public CartPage open_cart()
    {
        driver.findElement(cart).click();
        return new CartPage(driver);
    }


    // on going later...
    public String button_name_converter(String button_name)
    {
        String new_button_name = "";
        return new_button_name;
    }


}
