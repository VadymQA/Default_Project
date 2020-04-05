package com.IT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(name = "login")
	private WebElement inputlogin;
	@FindBy(name = "pass")
	private WebElement inputPassword;
    @FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
    private WebElement btnSubmit;
	/*@FindBy(xpath="/html/body/div[4]/div[3]/div[1]/ul/li[1]/a")
	private WebElement test;*/


    protected void login(String login, String pass){
     //  driver.scrollToElement(test);
     //   driver.scrollUp();
        //driver.sendKeysOneByOne(inputlogin, login);
        inputlogin.sendKeys(login);
        inputPassword.sendKeys(pass);
        btnSubmit.click();
    }




}
