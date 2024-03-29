package org.example.Selenium1603;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sel12 {
    //Positive Scenario
    String expt_page_name = "Dashboard";

    @Test
    @Description("Verfiy the current URl, title of VWO app")
    public void testVWOLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-username")).sendKeys("avijeetjana26@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Password@2024#1");
        driver.findElement(By.id("js-login-btn")).click();
        driver.quit();

    }
}
