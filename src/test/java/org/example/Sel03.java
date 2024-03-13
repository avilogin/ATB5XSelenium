package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Sel03 {

    @Test
    public void extentions()
    {
        ChromeOptions cm = new ChromeOptions();
        cm.addArguments("--start-maximized");
        cm.addExtensions(new File("D:\\Documents for Study\\Adblocker.crx"));
        WebDriver driver = new ChromeDriver(cm);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
