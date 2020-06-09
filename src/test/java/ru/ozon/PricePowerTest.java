package ru.ozon;

import Pages.HomePage;
import Pages.JuicersPage;
import Pages.ShopCart;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import setup.OpenClose;
import users.TestListener;

@Listeners({TestListener.class})
public class PricePowerTest extends OpenClose {
    @Test
    public void fourthTest() {
        HomePage homePage = new HomePage(driver, webDriverWait);

        JuicersPage juicersPage = new JuicersPage(driver);
        juicersPage.openCatalog();

        juicersPage.setMinPrice();
        juicersPage.setMaxPrice();

        juicersPage.setMinPower();

        juicersPage.sort();
        juicersPage.checkPriceRange();
        juicersPage.checkPowerRange();
        juicersPage.addToCartWithPower();


        ShopCart basketPage = new ShopCart(driver);
        basketPage.openCart();
        basketPage.checkPowerPrices();
    }
}
