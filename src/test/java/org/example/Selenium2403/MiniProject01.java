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
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MiniProject01 {

    ChromeDriver driver;
    String comment_provided = "Hello Automation 123";

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

        //Providing Values in username
        WebElement username = driver.findElement(By.xpath("//input[@id = \"txt-username\"]"));
        username.sendKeys("John Doe");

        //Providing Values in password
        WebElement password = driver.findElement(By.xpath("//input[@name = \"password\"]"));
        password.sendKeys("ThisIsNotAPassword");

        //Clicking the login button
        driver.findElement(By.xpath("//button[@id = \"btn-login\"]")).click();

        //Waiting for the page to load
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@id = \"combo_facility\"]"))));

        //selecting from the dropdown
        WebElement facility = driver.findElement(By.id("combo_facility"));
        Select sel = new Select(facility);
        sel.selectByVisibleText("Seoul CURA Healthcare Center");

        //clicking the checkbox
        driver.findElement(By.id("chk_hospotal_readmission")).click();

        //providing the date
        WebElement date = driver.findElement(By.xpath("//input[@id = \"txt_visit_date\"]"));
        date.sendKeys("17/04/2024");

        //providing th comment
        WebElement comment_element = driver.findElement(By.xpath("//textarea[@id = \"txt_comment\"]"));
        comment_element.sendKeys(comment_provided);

        //clicking the button
        driver.findElement(By.xpath("//button[@id = \"btn-book-appointment\"]")).click();

        //fetching the text provided and validating it
        String comment_derived = driver.findElement(By.xpath("//p[@id = \"comment\"]")).getText();
        Assert.assertEquals(comment_provided,comment_derived);



    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
