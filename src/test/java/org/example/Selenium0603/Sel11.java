package org.example.Selenium0603;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sel11 {

    @Test
    @Description("Verfiy the current URl, title of VWO app")
    public void testVWOLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-username")).sendKeys("test@gmail.com");


    }
}

/*
Priority of the attribute to find the element
id, className, name, css Selector, xpath
 LinkText and PartialText which are only for <a>

 */