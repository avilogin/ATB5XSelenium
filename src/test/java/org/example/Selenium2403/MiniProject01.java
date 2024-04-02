package org.example.Selenium2403;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MiniProject01 {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }


    @Test(groups = "Project")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        String URL = "https://katalon-demo-cura.herokuapp.com/";

        //Opening the URL
        driver.get(URL);
        driver.manage().window().maximize();

        //clicking the button
        driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]")).click();

        //waiting for the element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id = \"txt-username\"]"))));

        //Providing Values
        WebElement username = driver.findElement(By.xpath("//input[@id = \"txt-username\"]"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.xpath("//input[@name = \"password\"]"));
        password.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.xpath("//button[@id = \"btn-login\"]")).click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id = \"combo_facility\"]"))));

        WebElement facility = driver.findElement(By.id("combo_facility"));
        Select sel = new Select(facility);
        sel.selectByVisibleText("Seoul CURA Healthcare Center");

        driver.findElement(By.id("chk_hospotal_readmission")).click();







        Thread.sleep(5000);









    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
