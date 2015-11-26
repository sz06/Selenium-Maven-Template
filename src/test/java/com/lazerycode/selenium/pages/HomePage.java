package com.lazerycode.selenium.pages;

import com.lazerycode.selenium.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(how = How.ID, using = "lst-ib")
    private WebElement searchInput;

    @FindBy(how = How.ID, using = "sbds")
    private WebElement googleSearchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tsf\"]/div[2]/div[3]/center/input[2]")
    private WebElement imFeelingLuckyButton;

    public HomePage() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public HomePage enterSearchString(String searchString) {
        searchInput.clear();
        searchInput.sendKeys(searchString);
        return this;
    }

    public void googleSearch() {
        googleSearchButton.click();
    }

    public void feelingLuckySearch() {
        imFeelingLuckyButton.click();
    }

    public String getTitle () throws Exception {
        return DriverFactory.getDriver().getTitle();
    }
}
