package org.example.SeleniumBasics;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Sel07 {

    @Test
    public void extentions()
    {
        ChromeOptions cm = new ChromeOptions();

        cm.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(cm);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
