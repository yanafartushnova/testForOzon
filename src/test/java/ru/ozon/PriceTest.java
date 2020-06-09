package ru.ozon;

import Pages.HomePage;
import Pages.JuicersPage;
import Pages.ShopCart;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import setup.OpenClose;
import users.TestListener;

@Listeners({TestListener.class})
public class PriceTest extends OpenClose {
    @Test
    public void thirdTest() {
        HomePage homePage = new HomePage(driver, webDriverWait);

        JuicersPage juicersPage = new JuicersPage(driver);
        juicersPage.openCatalog();
        juicersPage.setMinPrice();
        juicersPage.setMaxPrice();
        juicersPage.sort();
        juicersPage.checkPriceRange();
        juicersPage.addToCart();


        ShopCart shopCart = new ShopCart(driver);
        shopCart.openCart();
        shopCart.checkPrices();
    }
}
