package org.example.SeleniumBasics;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Sel06 {

    @Test
    public void extentions()
    {
        ChromeOptions cm = new ChromeOptions();

        Proxy proxy = new Proxy();//this will help opening the browser in a proxy server
        proxy.setHttpProxy("121.40.185.42:1080");//here we need to provide the IP address and port number
        cm.setCapability("proxy", proxy);
        WebDriver driver = new ChromeDriver(cm);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
