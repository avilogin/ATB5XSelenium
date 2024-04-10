package org.example.Selenium3103;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Sel47 {

    //EXCEPTIONS

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

        try {
            driver.get("https://google.com");
            driver.manage().window().maximize();
            Thread.sleep(5000);

            WebElement search_box = driver.findElement(By.xpath("//textarea[@class= 'gLFyf']"));
            driver.navigate().refresh();
        /*
        if we will refresh the window after finding the element then the send keys will give the StaleElementReferenceException.
        In order to handle that we need to search the element again or we can us ethe exception handling mechanism.
*/

            search_box.sendKeys("Facebook");

            Thread.sleep(5000);
        }catch (StaleElementReferenceException| NoSuchElementException ex )
        {
           ex.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
