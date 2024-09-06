package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By cont_shopping = By.id("continue-shopping");
    private By cart_items = By.className("cart_item"); // cart item inside cart itself...


    public int get_items_count_in_cart()
    {
        List<WebElement> items_countt = driver.findElements(cart_items);
        return items_countt.size();
    }

    public void click_cont_shopping()
    {
        driver.findElement(cont_shopping).click();
    }


}
