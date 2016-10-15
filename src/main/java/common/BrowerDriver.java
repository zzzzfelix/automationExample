package common;

import common.BrowserType.ChromeBrowserDriver;
import common.BrowserType.FirefoxBrowserDriver;
import org.openqa.selenium.WebDriver;

public class BrowerDriver {
    private static WebDriver driver;

    public static void newSession() {
        driver = getDefaultBrowser();
    }

    private static WebDriver getDefaultBrowser() {
        if ("CHROME".equals(DriverProperties.getDefaultBrowser())) {
            return new ChromeBrowserDriver().buildDriver();
        } else {
            return new FirefoxBrowserDriver().buildDriver();
        }
    }

    public static void goToURL(String url) {
        BrowerDriver.driver.get(url);
    }

    public static void closeSession() {
        driver.close();
        driver.quit();
    }
}
