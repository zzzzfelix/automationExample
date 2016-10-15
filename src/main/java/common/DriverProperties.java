package common;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class DriverProperties {
    private final static Config config = ConfigFactory.load();

    public static String getChromeDriverLocation() {
        return config.getString("chrome.driver.location");
    }

    public static String getFirefoxDriverLocation() {
        return config.getString("firefox.driver.location");
    }

    public static String getDefaultBrowser() {
        return config.getString("default.browser");
    }
}
