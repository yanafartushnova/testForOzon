package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShopCart {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__ozon\"]/div/div[1]/div/div/div[3]/div[4]/div[1]/div[1]/div/div[2]/div[3]/div[3]/div[1]/div/span")
    private WebElement price;


    @FindBy(xpath = "//*[@id=\"__ozon\"]/div/div[1]/div/div/div[3]/div[4]/div[1]/div[1]/div/div[2]/div[3]/div[3]/div[1]/div/span")
    private WebElement pricePowerJuicer;

    @FindBy(xpath = "//*[@id=\"__ozon\"]/div/div[1]/div/div/div[3]/div[4]/div[2]/div/section/div[2]/div[4]/span[2]")
    private WebElement priceCart;

    @FindBy(xpath = "//*[@id=\"__ozon\"]/div/div[1]/div/div/div[3]/div[4]/div[2]/div/section/div[2]/div[4]/span[2]")
    private WebElement pricePowerJuicerCart;

    public ShopCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @Step("Открыть корзину")
    public void openCart() {
        driver.get("https://www.ozon.ru/cart");
    }

    @Step("Проверить цену соковыжималки и цену в корзине")
    public void checkPrices() {
        Assert.assertEquals(this.priceCart.getText(), this.price.getText());
    }

    @Step("Проверить цену с выбором мощности соковыжималки и цену в корзине")
    public void checkPowerPrices() {
        Assert.assertEquals(this.pricePowerJuicer.getText(), this.pricePowerJuicerCart.getText());;
    }

}
