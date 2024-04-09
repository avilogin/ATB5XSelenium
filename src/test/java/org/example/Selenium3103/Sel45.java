package org.example.Selenium3103;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Sel45 {

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
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement searchelement = driver.findElement(By.xpath("//input[@id=\"search_city\"]"));
        searchelement.sendKeys("India" + Keys.ENTER);

        ////table[@id='example']/tbody/tr/td[2]

        List<WebElement> list_of_states = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));



        for (WebElement l : list_of_states) {

            String s1 = driver.findElement(with(By.tagName("p")).toRightOf(l)).getText();
            String s2 = driver.findElement(with(By.tagName("p")).toLeftOf(l)).getText();
            System.out.println( s2 + " | " + l.getText() + " | " + s1);

//            String s3 = driver.findElement(with(By.tagName("p")).below(l)).getText();
//            String s4 = driver.findElement(with(By.tagName("p")).above(l)).getText();
//            System.out.println( s4 + " | " + l.getText() + " | " + s3);

       }


        Thread.sleep(5000);

        //1:21



    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
