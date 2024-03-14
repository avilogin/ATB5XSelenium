package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Sel09 {

    public static void main(String[] args) throws MalformedURLException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://bing.com"); //  // No back, forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        ChromeOptions cm = new ChromeOptions();
        cm.addArguments("--incognito");
        driver.navigate().refresh();
    }
}
