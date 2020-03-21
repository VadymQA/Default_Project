package com.IT.tests;


import com.IT.pages.DashboardPage;
import com.IT.pages.LoginPage;
import com.IT.utils.QAUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import users.User;
import users.UserFactory;


import java.time.LocalDate;
import java.util.List;

public class MyTest extends BaseTest {
    @Test
    public void testName() {

        app.loginHelper.login(validUser);
        app.common.wait1s();
        Assert.assertEquals(app.dashboardHelper.getLinkUserEmail(), validUser.email);
        app.common.wait1s();
        app.dashboardHelper.createNewMail();
        app.common.wait1s();
        app.mailHelper.writeNewMailToYourself();
        app.common.wait1s();
        //Assert.assertEquals(app.dashboardHelper.checkSuccessfulMsg(), "Письмо успешно отправлено адресатам");
        //Expected кракозябрами выводит. тест падает )
        //app.common.wait1s();

        app.dashboardHelper.goToInbox();
        Assert.assertEquals(app.dashboardHelper.mailCheck(), "Test subject" + LocalDate.now());

        //отправки почты  и проверка что письмо пришло

        /*WebDriver driver = app.common.getDriver();
        driver.get("https://google.com.ua");
        System.out.println("CurrentUrl" + driver.getCurrentUrl());*/

        /*List<User> users = UserFactory.getRandomUsers(10);
        users.forEach(System.out::println);*/


         /*chromeDriver.findElement(By.name("login")).sendKeys("ittest2");
        chromeDriver.findElement(By.name("pass")).sendKeys("337774a");
        chromeDriver.findElement(By.xpath("//form[@name='lform']/p/input[@type=\'submit\']")).click();*/
// //input[@name="login"]
        // //input[@name="pass"]

        /*String text = chromeDriver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();
        Assert.assertEquals(text, "ittest2@i.ua");*/
    }


}
