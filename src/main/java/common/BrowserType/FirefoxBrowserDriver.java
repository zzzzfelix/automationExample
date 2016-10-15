package common.BrowserType;

import common.DriverProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDriver implements BrowserType {
    private final String DRIVERLOCATION_PROPS = "webdriver.gecko.driver";

    public WebDriver buildDriver() {
        System.setProperty(DRIVERLOCATION_PROPS, DriverProperties.getFirefoxDriverLocation());
        return new FirefoxDriver();
    }
}
