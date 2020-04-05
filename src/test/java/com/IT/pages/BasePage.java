package com.IT.pages;

import com.IT.driver.DriverFactory;
import com.IT.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.sql.DriverManager;

public abstract class BasePage {
   protected static MyDriver driver = MyDriver.getInstance();
    protected Logger log = Logger.getLogger(this.getClass().getCanonicalName());

    public BasePage () {
        PageFactory.initElements(driver, this);
    }

}
