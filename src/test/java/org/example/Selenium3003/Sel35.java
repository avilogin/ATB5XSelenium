package org.example.Selenium3003;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sel35 {

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
        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);
        driver.manage().window().maximize();

        // THETESTINGACADEMY
        // Shift Keydown -> thtestingacademy + Shift KeyUp

        WebElement firstName = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);
        actions
                .keyDown(Keys.SHIFT)
                .sendKeys(firstName,"thetestingacademy")
                .keyUp(Keys.SHIFT).build().perform();

        WebElement link = driver.findElement(By.xpath("//a[contains(text(),\"Click here to Download File\")]"));
        actions.contextClick(link).build().perform();





        Thread.sleep(13000);










    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
