package org.example.Selenium3103;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Sel42 {

    //Upload File
    //Selenium can only handle the file uploading if the tag is input and type is file

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }


    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);


        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main Window "+mainWindowHandle);
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handles : windowHandles)
        {
           driver.switchTo().window(handles);
            if (driver.getPageSource().contains("New Window"))
            {
                System.out.println("Test Case Passed");
            }
        }
        driver.switchTo().window(mainWindowHandle);


        Thread.sleep(5000);










    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
