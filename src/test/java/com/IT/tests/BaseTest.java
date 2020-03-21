package com.IT.tests;

import com.IT.App;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import users.User;
import users.UserFactory;

public abstract class BaseTest {
    App app = new App();
    User validUser = UserFactory.getValidUser();
    @AfterSuite
    public void tearDown() {
        //app.common.stopApp();

    }

}
