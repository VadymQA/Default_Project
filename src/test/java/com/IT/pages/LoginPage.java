package com.IT.pages;

import com.IT.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(name = "login")
	private WebElement inputlogin;
	@FindBy(name = "pass")
	private WebElement inputPassword;
    @FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
    private WebElement btnSubmit;

    protected void login(String login, String pass){
        inputlogin.sendKeys(login);
        inputPassword.sendKeys(pass);
        btnSubmit.click();
    }




}
