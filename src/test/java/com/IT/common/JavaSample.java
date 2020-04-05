package com.IT.common;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

    public static final String USERNAME = "vadymqa1";
    public static final String AUTOMATE_KEY = "9YdMqRWSh13KZKvAJMWM";
    public static final String URL = "https://" + "vadymqa1" + ":" + "9YdMqRWSh13KZKvAJMWM"
            + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "75.0 beta");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "7");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("name", "Bstack-[Java] Sample Test");

        WebDriver driver = new RemoteWebDriver(new URL("https://" + "vadymqa1" + ":" + "9YdMqRWSh13KZKvAJMWM"
                + "@hub-cloud.browserstack.com/wd/hub"), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("BrowserStack");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

    }
}