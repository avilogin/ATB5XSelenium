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

public class Sel29 {

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
        String URL = "https://awesomeqa.com/webtable.html";
        driver.get(URL);
        driver.manage().window().maximize();

        // //table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling::td

        String first_part = "//table[@id=\"customers\"]/tbody/tr[" ;
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for (int i=2;i<=row;i++)
        {
            for (int j=1;j<=col;j++)
            {
                String dynamic_xpath = first_part+i+second_part+j+third_part;
                String value = driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(value);
                if (value.contains("Giovanni Rovelli"))
                {
                    String country = dynamic_xpath+"/following-sibling::td";
                    String country_val = driver.findElement(By.xpath(country)).getText();
                    System.out.println("Giovanni Rovelli -----------> "+country_val);
                }
            }
        }




    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
