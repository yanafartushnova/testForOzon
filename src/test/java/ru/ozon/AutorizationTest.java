package ru.ozon;

import Pages.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import setup.OpenClose;
import users.TestListener;

@Listeners({TestListener.class})
public class AutorizationTest extends OpenClose {

    @Test
    public void firstTest() {
        HomePage homePage = new HomePage(driver, webDriverWait);
        homePage.clickLogBut();
        homePage.inputPhoneNum();
        homePage.inputCode();
        homePage.checkSettings();
    }
}
