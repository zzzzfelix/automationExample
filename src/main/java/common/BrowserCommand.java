package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCommand {

    public static void click(By element) {
        WebElement webElement = BrowerDriver.driver.findElement(element);
        new BrowserWaitCommand().untilElementExist(webElement);

        webElement.click();
    }

    public static String getElementValue(By element) {
        WebElement webElement = BrowerDriver.driver.findElement(element);
        new BrowserWaitCommand().untilElementExist(webElement);

        return webElement.getText();
    }
}
