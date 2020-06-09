package setup;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {
    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] makeScreen(){
        return((TakesScreenshot) OpenClose.driver).getScreenshotAs(OutputType.BYTES);
    }
}
