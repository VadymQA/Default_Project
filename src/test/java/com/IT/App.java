package com.IT;

import com.IT.helpers.CommonHelper;
import com.IT.helpers.DashboardHelper;
import com.IT.helpers.LoginHelper;
import com.IT.helpers.MailHelper;
import com.IT.pages.DashboardPage;
import com.IT.pages.MailPage;

public class App {

    public CommonHelper common;
    public LoginHelper loginHelper;
    public DashboardHelper dashboardHelper;
    public MailHelper mailHelper;

    public App() {
        common = new CommonHelper();
        loginHelper = new LoginHelper();
        dashboardHelper = new DashboardHelper();
        mailHelper = new MailHelper();
    }
}
