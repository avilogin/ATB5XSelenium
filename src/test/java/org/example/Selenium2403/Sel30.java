package org.example.Selenium2403;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Sel30 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        String URL = "https://awesomeqa.com/webtable1.html";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
        List<WebElement> tab_rows = table.findElements(By.tagName("tr"));
        System.out.println(tab_rows.size());

        for (int i = 0; i < tab_rows.size(); i++) {
            List<WebElement> col = tab_rows.get(i).findElements(By.tagName("td"));

            for (WebElement e: col){
                System.out.println(e.getText());
            }
        }







    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
