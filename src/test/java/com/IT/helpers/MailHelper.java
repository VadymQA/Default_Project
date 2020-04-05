package com.IT.helpers;

import com.IT.pages.MailPage;
import letter.Letter;

public class MailHelper extends MailPage {

    public void writeNewMail(Letter letter) {

        writeNewMail(letter.subject, letter.body);

    }

}
