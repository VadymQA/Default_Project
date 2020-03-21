package com.IT.helpers;

import com.IT.pages.LoginPage;
import users.User;

public class LoginHelper extends LoginPage {
    //метод логи который задает юзера
    public void login(User user) {
        login(user.username, user.password);
    }
}
