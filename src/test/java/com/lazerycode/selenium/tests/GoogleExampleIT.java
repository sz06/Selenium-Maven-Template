package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverFactory;
import com.lazerycode.selenium.pages.HomePage;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class GoogleExampleIT extends DriverFactory {

    @Test
    public void googleCheeseExample() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        HomePage homePage = new HomePage();

        homePage.enterSearchString("Cheese!").googleSearch();

        // Check the title of the page
        System.out.println("Page title is: " + homePage.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + homePage.getTitle());
    }

    @Test
    public void googleMilkExample() throws Exception {

        WebDriver driver = getDriver();

        driver.get("http://www.google.com");

        HomePage homePage = new HomePage();

        homePage.enterSearchString("Milk!").googleSearch();

        System.out.println("Page title is: " + homePage.getTitle());

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("milk!");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());
    }
}