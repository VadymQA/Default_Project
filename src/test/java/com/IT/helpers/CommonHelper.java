package com.IT.helpers;

import com.IT.common.BasePage;
import org.openqa.selenium.WebDriver;

public class CommonHelper extends BasePage {

    public void stopApp(){
        chromeDriver.quit();
    }
    public WebDriver getDriver(){
        return chromeDriver;
    }
    public void wait1s() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
