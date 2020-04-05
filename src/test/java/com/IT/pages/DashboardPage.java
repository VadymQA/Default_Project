package com.IT.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement linkUserEmail;
    @FindBy(xpath = "(//ul[@class = 'sn_menu']//li/a)[1]")
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

    public void createNewMail() {      linkNewMail.click();    }


    public String checkSuccessfulMsg() {
        return divSuccessfulMsg.getText();
    }

    public void goToInbox() {      linkInbox.click();    }
    public String mailCheck(){
        /*Action build = new Actions(driver).moveToElement(linkNewMail).click().build(); //сохранить порядок действий
        build.perform(); // выполнить билд*/
        //driver.wait.until(s->s.findElement(By.xpath("")).isDisplayed());
        driver.wait.until(ExpectedConditions.visibilityOf(newMailSubject));
        return newMailSubject.getText();
    }


}
