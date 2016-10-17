package common;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class BrowserWaitCommand {
    private Wait wait;

    public BrowserWaitCommand() {
        wait = new FluentWait(BrowerDriver.getCurrentDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
    }

    public void untilElementExist(final By cssSelector) {
       wait.until(new Function<WebElement, Boolean>() {
            public Boolean apply(WebElement webElement) {
                return webElement.findElement(cssSelector).isDisplayed();
            }
        });
    }
}
