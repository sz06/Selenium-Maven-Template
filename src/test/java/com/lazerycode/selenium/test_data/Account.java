package com.lazerycode.selenium.test_data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sz06 on 2015-12-16.
 */
public enum Account {

    ACCOUNT1 ("account1@example.com", "password");

    public final List<String> credentials;

    Account(String userName, String pw) {
        credentials = new ArrayList<>();
        credentials.add(userName);
        credentials.add(pw);
    }

    public String getEmailAddress() {
        return credentials.get(0);
    }

    public String getPassword() {
        return credentials.get(1);
    }
}
