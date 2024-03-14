package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Sel04 {

    @Test
    public void extentions()
    {
        ChromeOptions cm = new ChromeOptions();
        //cm.addArguments("--window-size=800,600");
        //cm.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(cm);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
