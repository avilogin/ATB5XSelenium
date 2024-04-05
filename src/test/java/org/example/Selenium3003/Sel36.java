package org.example.Selenium3003;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sel36 {

    //Action Class

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
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();
       WebElement source =  driver.findElement(By.xpath("https://www.spicejet.com/"));
       Actions action = new Actions(driver);
       action.moveToElement(source).click().build().perform();
        action.moveToElement(source).click().sendKeys("BLR").build().perform();



        Thread.sleep(13000);










    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
