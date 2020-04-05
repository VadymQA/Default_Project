package com.IT.helpers;

import com.IT.pages.LoginPage;
import users.User;

public class LoginHelper extends LoginPage {
    //метод логи который задает юзера
    public void login(User user) {
        log.info(String.format("Login user username - %s , password - %s%n", user.username, user.password));
        login(user.username, user.password);
    }
}
