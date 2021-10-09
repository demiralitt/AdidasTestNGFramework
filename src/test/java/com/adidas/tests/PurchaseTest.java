package com.adidas.tests;

import com.adidas.base.BasePage;
import com.adidas.base.TestBase;
import com.adidas.pages.CartPage;
import com.adidas.pages.ProductsPage;
import org.testng.annotations.Test;

public class PurchaseTest extends TestBase {

    ProductsPage productPage = new ProductsPage();
    BasePage cartPage = new CartPage();


    @Test
    public void test1(){

        productPage.cart.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
    }
}
