package com.IT.helpers;

import com.IT.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class CommonHelper extends BasePage {

    public void stopApp(){
        driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }
    public void wait1s() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
