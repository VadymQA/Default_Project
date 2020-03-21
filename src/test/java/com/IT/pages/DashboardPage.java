package com.IT.pages;


import com.IT.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.debugger.Page;

import java.time.LocalDate;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement linkUserEmail;
    @FindBy(xpath = "(//ul[@class = 'sn_menu']//li)[2]")
    private WebElement linkNewMail;
    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement textAreaTo;
    @FindBy(xpath = "//input[@name='subject']")
    private WebElement inputMailSubject;
    @FindBy(xpath = "//div[@class='text_editor_browser']/textarea[@name='body']")
    private WebElement textAreaMailBody;
    @FindBy(xpath = "//p[@class = 'send_container']//input[@name= 'send']")
    private WebElement inputSendMail;
    @FindBy(xpath = "//div[@class = 'block_confirmation']/div[@class = 'content clear']")
    private WebElement divSuccessfulMsg;
    @FindBy(xpath = "//li[@class ='new']/a")
    private WebElement linkInbox;
	@FindBy(xpath="(//div[@class ='row new']//span[@class= 'sbj'])[1]")
	private WebElement newMailSubject;


    public String getLinkUserEmail() {
        return linkUserEmail.getText();
    }

    public void createNewMail() {
        linkNewMail.click();
    }


    public String checkSuccessfulMsg() {
        return divSuccessfulMsg.getText();
    }

    public void goToInbox() {
        linkInbox.click();
    }
    public String mailCheck(){
        return newMailSubject.getText();
    }


}
