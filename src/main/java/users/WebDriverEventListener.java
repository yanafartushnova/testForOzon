package users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import setup.Screenshot;

public class WebDriverEventListener extends AbstractWebDriverEventListener {
    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        Screenshot.makeScreen();
    }

    @Override
    public void afterChangeValueOf(WebElement element,
                                   WebDriver driver,
                                   java.lang.CharSequence[] keysToSend){
        Screenshot.makeScreen();
    }
}
