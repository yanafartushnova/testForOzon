package ru.ozon;

import Pages.CityPage;
import Pages.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import setup.OpenClose;
import users.TestListener;

import static setup.OpenClose.webDriverWait;

@Listeners({TestListener.class})
public class CityTest extends OpenClose {

    @Test
    public void secondTest() {
        HomePage homePage = new HomePage(driver, webDriverWait);
        CityPage cityPage = new CityPage(driver);
        cityPage.clickCityLbl();
        cityPage.inputCity();
        cityPage.checkNewCity();
        homePage.clickLogBut();
        homePage.inputPhoneNum();
        homePage.inputCode();
        homePage.checkSettings();
        cityPage.checkNewCityAfter();
    }
}
