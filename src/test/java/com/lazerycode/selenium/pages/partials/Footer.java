package com.lazerycode.selenium.pages.partials;

import com.lazerycode.selenium.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Footer {
    @FindBy (how = How.LINK_TEXT, using = "//www.google.ca/intl/en/about.html?fg=1")
    private WebElement about;
}
