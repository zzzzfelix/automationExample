package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCommand {

    public static void click(By element) {
        WebElement webElement = BrowerDriver.getCurrentDriver().findElement(element);
        new BrowserWaitCommand().untilElementExist(element);

        webElement.click();
    }

    public static String getElementValue(By element) {
        WebElement webElement = BrowerDriver.getCurrentDriver().findElement(element);
        new BrowserWaitCommand().untilElementExist(element);

        return webElement.getText();
    }
}
