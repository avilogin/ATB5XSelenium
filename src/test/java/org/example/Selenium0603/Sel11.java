package org.example.Selenium0603;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sel11 {
    String expt_err_msg = "Your email, password, IP address or location did not match";

    @Test
    @Description("Verfiy the current URl, title of VWO app")
    public void testVWOLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-username")).sendKeys("avijeetjana26@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Password");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(3000);
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        String error_msg_text = error_message.getText();
        String element_attribute = error_message.getAttribute("id");//gets the value of the provided attribute
        System.out.println(element_attribute );
        Assert.assertEquals(error_msg_text,expt_err_msg);

        driver.quit();


    }
}

/*
Priority of the attribute to find the element
id, className, name, css Selector, xpath
 LinkText and PartialText which are only for <a>

 */