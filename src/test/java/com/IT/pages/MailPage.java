package com.IT.pages;

import com.IT.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;

public class MailPage extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement linkUserEmail;
    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement textAreaTo;
    @FindBy(xpath = "//input[@name='subject']")
    private WebElement inputMailSubject;
    @FindBy(xpath = "//div[@class='text_editor_browser']/textarea[@name='body']")
    private WebElement textAreaMailBody;
    @FindBy(xpath = "//p[@class = 'send_container']//input[@name= 'send']")
    private WebElement inputSendMail;

    public void writeNewMailToYourself() {
        String n = linkUserEmail.getText();
        textAreaTo.sendKeys(n);
        inputMailSubject.sendKeys("Test subject" + LocalDate.now());
        textAreaMailBody.sendKeys("Test message body");
        inputSendMail.click();
    }
}
