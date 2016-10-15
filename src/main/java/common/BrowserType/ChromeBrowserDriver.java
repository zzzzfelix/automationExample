package common.BrowserType;

import common.DriverProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDriver implements BrowserType {
    private final String DRIVERLOCATION_PROPS = "webdriver.chrome.driver";

    public WebDriver buildDriver() {
        System.setProperty(DRIVERLOCATION_PROPS, DriverProperties.getChromeDriverLocation());
        return new ChromeDriver();
    }
}
