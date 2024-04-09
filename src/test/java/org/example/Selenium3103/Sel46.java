package org.example.Selenium3103;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Sel46 {

    //Relative Locators
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
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();
        Thread.sleep(10000);

        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//form[@id='form']/button")).click();

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement error_element= driver.findElement(with(By.tagName("small")).below(username));
        String error_message = error_element.getText();
        System.out.println(error_message);
        Assert.assertTrue(error_element.isDisplayed());
        Assert.assertEquals(error_message,"Username must be at least 3 characters");


        Thread.sleep(5000);
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
