package com.IT.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.IT.common.Constans.*;

public class DriverFactory {
    static WebDriver getDriver() {
        WebDriver driver=null;
        String driverName = System.getProperty("driver");
        if (driverName != null && "gecko".equals(driverName)) {
            System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ((driverName != null && "remotedriver".equals(driverName))) {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Firefox");
            caps.setCapability("browser_version", "75.0 beta");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "7");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            try {
                driver = new RemoteWebDriver(new URL("https://" + "vadymqa1" + ":" + "9YdMqRWSh13KZKvAJMWM"
                        + "@hub-cloud.browserstack.com/wd/hub"), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();

            }
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        return driver;

    }
}
