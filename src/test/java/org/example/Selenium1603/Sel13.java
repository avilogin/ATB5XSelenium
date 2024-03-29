package org.example.Selenium1603;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sel13 {
    //Positive Scenario
    // Locators
    // 1. ID, ClassName, Name, byTag F(n) -> GetText and GetAttribute (Webelements)

    // 2. LinkText & Partial Text
    // 3.Css Selectors
    // 4. Xpath

    @Test
    @Description("Verfiy the current URl, title of VWO app")
    public void testVWOLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        WebElement full_anchor = driver.findElement(By.linkText("Start a free trial"));//works if the exact match of the text is found
        //WebElement partial_anchor = driver.findElement(By.partialLinkText("Start a free"));//works even if a part of the text is found
        System.out.println(full_anchor.getAttribute("href"));
        full_anchor.click();



        driver.close();

    }
}
