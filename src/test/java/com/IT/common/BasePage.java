package com.IT.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
   protected static WebDriver chromeDriver;

    static {
        System.setProperty("webdriver.chrome.driver", "cromeDriver\\chromedriver.exe/");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.i.ua/");
    }

    public BasePage () {
        PageFactory.initElements(chromeDriver, this);
    }

}
