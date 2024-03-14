package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Sel08 {

    @Test
    public void extentions()
    {
        ChromeOptions cm = new ChromeOptions();

        cm.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(cm);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //driver.quit();
        // this will close the browser completely
        // Closed All the window and Session = null, Error - Session ID is null

        driver.close();
        //this will only close the current tab or window
      // Closed the window, Session id != null, Error - Invalid session Id

    }
}
