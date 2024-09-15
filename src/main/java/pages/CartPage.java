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
    private By inventory_item_name = By.className("inventory_item_name"); // cart item inside cart itself...


    public int get_items_count_in_cart()
    {
        List<WebElement> items_countt = driver.findElements(cart_items);
        return items_countt.size();
    }

    String [] names = new String[2];
    public String get_items_names_in_cart(int i)
    {
        String res="";
        List<WebElement> items_names = driver.findElements(inventory_item_name);
        for (WebElement item: items_names) {
            res = names[i] = item.getText();
            i++;

        }

        return res;
    }

    public InventoryPage click_cont_shopping()
    {
        driver.findElement(cont_shopping).click();
        return new InventoryPage(driver);
    }


}
