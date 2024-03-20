package org.example.SeleniumBasics;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Sel05 {

    @Test
    public void extentions()
    {
        ChromeOptions cm = new ChromeOptions();
        //cm.setPageLoadStrategy(PageLoadStrategy.NONE);//this will not wait for the page to load
        //cm.setPageLoadStrategy(PageLoadStrategy.EAGER);//this will wait for a little bit for the page to load
        cm.setPageLoadStrategy(PageLoadStrategy.NORMAL);//this will wait for the page to load completely
        WebDriver driver = new ChromeDriver(cm);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
