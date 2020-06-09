package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.OpenClose;

import static org.testng.Assert.assertEquals;

public class HomePage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    private static final String LOGIN_BUTTON_XPATH = "//*[@id=\"__ozon\"]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/button/div/div";
    private static final String PHONE_INPUT_XPATH = "/html/body/div[3]/div/div/div/div/div/div/div/div/div[2]/label/div/input";
    private static final String CODE_INPUT_PATH = "/html/body/div[3]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[1]/input";
    private static final String SETTINGS_XPATH = "//*[@id=\"__ozon\"]/div/div[1]/header/div[1]/div[4]/div[1]/a";

    public HomePage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    @Step("Вход или регистрация")
    public void clickLogBut() {
        WebElement loginButton = driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
        assertEquals(loginButton.getText(), "Вход или регистрация");
        loginButton.click();
    }

    @Step("Ввод номера телефона")
    public void inputPhoneNum() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PHONE_INPUT_XPATH)));
        WebElement phoneInput = driver.findElement(By.xpath(PHONE_INPUT_XPATH));
        phoneInput.sendKeys(OpenClose.PHONE);
        phoneInput.sendKeys(Keys.ENTER);
    }

    @Step("Ввод кода")
    public void inputCode() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CODE_INPUT_PATH)));
        WebElement codeInput = driver.findElement(By.xpath(CODE_INPUT_PATH));
        codeInput.sendKeys(OpenClose.AUTH_CODE);
    }

    @Step("Проверка")
    public void checkSettings() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SETTINGS_XPATH)));
        WebElement settings = driver.findElement(By.xpath(SETTINGS_XPATH));
        assertEquals(settings.getAttribute("href"), OpenClose.OZON_URL + "/my/main");
    }

}
