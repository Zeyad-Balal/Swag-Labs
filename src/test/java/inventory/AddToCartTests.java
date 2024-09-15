package inventory;

import base.BaseTests;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;


import java.io.*;

import static org.testng.Assert.*;


public class AddToCartTests extends BaseTests {



    @Test
    public void add_to_cart_test() throws IOException {

        InventoryPage inventory = login.clickLogin();


        //add tshirt and jacket to cart.
        inventory.click_add_to_cart();

        //open cart to check items.
        CartPage cart = inventory.open_cart();

        //Assert that we successfully moved to nex page.
        assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html","fail");

    }

    @Test
    public void test_continue_shopping()
    {

    }

/*
    // JSON data as a string
    String jsonData = "{ \"inventory\": [" +
            "{ \"id\": 1, \"itemName\": \"Sauce Labs Backpack\", \"price\": 1500.00 }," +
            "{ \"id\": 2, \"itemName\": \"Sauce Labs Bike Light\", \"price\": 100.00 }," +
            "{ \"id\": 3, \"itemName\": \"Sauce Labs Fleece Jacket\", \"price\": 50.00 }" +
            "] }";

    @Test
    public void printInventory() {
        // Parse JSON string
        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();
        JsonArray inventoryArray = jsonObject.getAsJsonArray("inventory");

        // Loop through JSON array and print the data
        for (int i = 0; i < inventoryArray.size(); i++) {
            JsonObject item = inventoryArray.get(i).getAsJsonObject();
            int id = item.get("id").getAsInt();
            String itemName = item.get("itemName").getAsString();
            double price = item.get("price").getAsDouble();

            System.out.println("ID: " + id + ", Item Name: " + itemName + ", Price: $" + price);
        }
    }
*/


}
